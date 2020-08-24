package pachetAgenda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static pachetAgenda.CriteriuOrdonare.*;

public class Agenda {

    private List<Persoana> listaContacteNascuteAstazi = new ArrayList<>();
    private List<Persoana> listaContacte = new ArrayList<>();
    private List<Persoana> listaFiltrata = new ArrayList<>();
    private Map<CriteriuOrdonare, Comparator<Persoana>> mapComparare = new HashMap<>();
    private Predicate<Persoana> filtru = p1 -> p1.equals(p1);
    private CriteriuOrdonare critOrd = CriteriuOrdonare.DUPA_NUME;
    private Connection connection;

    public Agenda() throws SQLException {
        DBConnection dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        populeazaComparatoare();
    }

    public Agenda(Path p) throws IOException, FileNotFoundException, ClassNotFoundException {
        incarca(p);
        listaFiltrata = listaContacte;
        populeazaComparatoare();
    }

    public void populeazaDb() throws SQLException {
        ResultSet rs = connection.createStatement().executeQuery("select * from contacte");
        rs.beforeFirst();
        while (rs.next()) {
            LocalDate data = Util.transformaData(rs.getDate("data_nastere"));
            NrFix nf = rs.getString("nr_fix") == null ? null : new NrFix(rs.getString("nr_fix"));
            NrMobil nm = rs.getString("nr_mobil") == null ? null : new NrMobil(rs.getString("nr_mobil"));
            Persoana p = new Persoana(rs.getString("nume"), rs.getString("prenume"), data, nf, nm);
            p.setId(Integer.valueOf(rs.getString("id")));
            listaContacte.add(p);
            listaFiltrata = listaContacte;
        }
    }

    public void adaugaContact(Persoana p) throws SQLException {
        if (listaContacte.contains(p)) {
            throw new RuntimeException("Contactul se afla deja in agenda");
        } else {
            listaContacte.add(p);
            PreparedStatement ps = connection.prepareStatement("insert into contacte "
                    + "(nume, prenume, data_nastere, nr_fix, nr_mobil) values (?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getNume());
            ps.setString(2, p.getPrenume());
            ps.setDate(3, Date.valueOf(p.getData()));
            ps.setString(4, p.getNrFix().getNrTel());
            ps.setString(5, p.getNrMobil().getNrTel());
            ps.execute();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    p.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Crearea de contact esuata, nu exista ID-ul.");
                }
            }
        }
    }

    public void stergeContact(Persoana p) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("delete from contacte where id=" + p.getId());
        ps.execute();
        listaContacte.remove(p);
    }

    public void modificaContact(Persoana p1, Persoana p2) {
        for (Persoana p : listaContacte) {
            if (p.equals(p1)) {
                p.setNume(p2.getNume());
                p.setPrenume(p2.getPrenume());
                p.setData(p2.getData());
                p.setNrFix(p2.getNrFix());
                p.setNrMobil(p2.getNrMobil());
            }
        }
    }

    public List<Persoana> getListaContacte() {
        return listaContacte;
    }

    public List<Persoana> getListaFiltrata() {
        return listaFiltrata;
    }

    public List<Persoana> getListaContacteNascuteAzi() {
        return listaContacteNascuteAstazi;
    }

    public void filtreazaNrFix() {
        filtru = p1 -> p1.getNrFix() != null && !p1.getNrFix().getNrTel().isEmpty();
    }

    public void filtreazaNrMobil() {
        filtru = p1 -> p1.getNrMobil() != null && !p1.getNrMobil().getNrTel().isEmpty();
    }

    public void filtreazaNascutiAstazi() {
        filtru = p1 -> p1.getData().getDayOfMonth() == LocalDate.now().getDayOfMonth()
                && p1.getData().getMonthValue() == (LocalDate.now().getMonthValue());
    }

    public void filtreazaNascutiLunaCurenta() {
        filtru = p1 -> p1.getData().getMonth().equals(LocalDate.now().getMonth())
                && p1.getData().isAfter(LocalDate.now());
    }

    public void filtreazaPersonalizat(String val) {
        filtru = p1 -> p1.getNume().toLowerCase().contains(val.toLowerCase())
                || p1.getPrenume().toLowerCase().contains(val.toLowerCase())
                || p1.getNrFix() != null && p1.getNrFix().getNrTel().contains(val) || p1.getNrMobil() != null && p1.getNrMobil().getNrTel().contains(val);
    }

    public void ordoneaza(CriteriuOrdonare co) {
        critOrd = co;
    }

    public List contacte() {
        listaFiltrata = listaContacte.stream().filter(filtru).sorted(mapComparare.get(critOrd)).collect(Collectors.toList());
        return listaFiltrata;
    }

    public void resetareFiltru() {
        filtru = p1 -> p1.equals(p1);
    }

    public void salveaza(Path p) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(p.toFile());
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(listaContacte);
        }
        fos.close();
    }

    public void incarca(Path p) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(p.toFile());
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            listaContacte = (List<Persoana>) ois.readObject();
        }
        fis.close();
    }

    public void incarca() throws SQLException {
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = s.executeQuery("select * from contacte");
        rs.beforeFirst();
        while (rs.next()) {
            NrFix nrFix = rs.getString("nr_fix") == null ? null : new NrFix(rs.getString("nr_fix"));
            NrMobil nrMobil = rs.getString("nr_mobil") == null ? null : new NrMobil(rs.getString("nr_mobil"));
            Persoana p = new Persoana(rs.getString("nume"), rs.getString("prenume"), rs.getDate("data_nastere").toLocalDate(), nrFix, nrMobil);
            p.setId(rs.getInt("id"));
            listaContacte.add(p);
        }
    }

    public void populeazaListaNascutiAzi() {
        listaContacteNascuteAstazi.clear();
        for (Persoana p : listaContacte) {
            if (p.getData().getMonth().equals(LocalDate.now().getMonth())
                    && p.getData().getDayOfMonth() == (LocalDate.now().getDayOfMonth())) {
                listaContacteNascuteAstazi.add(p);
            }
        }
    }

    private void populeazaComparatoare() {
        Comparator<Persoana> comparatorNume = (p1, p2) -> p1.getNume().compareTo(p2.getNume());
        Comparator<Persoana> comparatorPrenume = (p1, p2) -> p1.getPrenume().compareTo(p2.getPrenume());
        Comparator<Persoana> comparatorData = (p1, p2) -> p1.getData().compareTo(p2.getData());
        Comparator<Persoana> comparatorNrFix = (p1, p2) -> p1.getNrFix().compareTo(p2.getNrFix());
        Comparator<Persoana> comparatorNrMobil = (p1, p2) -> p1.getNrMobil().compareTo(p2.getNrMobil());
        mapComparare.put(DUPA_NUME, comparatorNume);
        mapComparare.put(DUPA_PRENUME, comparatorPrenume);
        mapComparare.put(DUPA_DATA, comparatorData);
        mapComparare.put(DUPA_NUMAR_FIX, comparatorNrFix);
        mapComparare.put(DUPA_NUMAR_MOBIL, comparatorNrMobil);
    }
}
