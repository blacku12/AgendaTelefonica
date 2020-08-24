package pachetAgenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) throws SQLException, IOException, FileNotFoundException, ClassNotFoundException, InterruptedException, ParseException {

        //        String nume = " 15iOn  ";
//        String nume1 = " iOn@";
//        String nume2 = " iOn";
//        String prenume = " bla";
//        String n = Util.transformaNume(nume);
//        System.out.println(n);
//
//        String data = "19790611";
//        LocalDate ld = Util.transformaData(data);
//        NrFix nf = new NrFix("0236569875");
//        NrMobil nm = new NrMobil("0721546987");
//System.out.println(Util.transformaData(data));
//System.out.println(Verifica.formatnume(nume1));
//System.out.println(Verifica.marimeNume(nume2));
//        System.out.println(Verifica.data(data));
//
//        
//        List l = new ArrayList();
//       Queue q = new ArrayDeque();
//       NavigableMap m = new TreeMap();
//      
//        Persoana p = new Persoana(nume2, prenume, ld, nf, nm);
//        Persoana p2 = new Persoana(nume2, "petrescu", ld, new NrFix("0236569875"));
//        Boolean b = p.equals(p2);
//        System.out.println(b);
//        System.out.println(p.getNrMobil());
//        System.out.println(p.getNrFix());
//        System.out.println(p.getNume());
//        System.out.println(p.getPrenume());
//        System.out.println(p.getData());
//       Persoana p1 = new Persoana();
//       
//       p.equals(p1);
//        NrTel t = new NrMobil("0721587254");
//        NrTel t1 = new NrMobil("0721587254");
//        NrTel t3 = new NrFix("07215254873");
// NrTel t4 = new NrMobil("0721587254");
//System.out.println(t);
//System.out.println(t.equals(t4));
//System.out.println(t4);
// Persoana p = Persoana.getInstance("","","","");
//        DBConnection c = new DBConnection();
//        Connection con = c.getConnection();
//        PreparedStatement s = con.prepareStatement("insert into contacte (nume, prenume, data_nastere) values (?,?,?)");
//        s.setString(1, "Nicolescu");
//        s.setString(2, "Andrei");
//        s.setDate(3, Date.valueOf(LocalDate.now()));
//        s.execute();
//s.execute("insert into contacte (nume, penume, data_nastere) values (?,?,?)", "Nicolescu", "Andrei", "11-02-2020");
//System.out.println(new File("").getAbsolutePath());
//File dir = new File(".\\resurse\\banners");
//File[] listaFisiere = dir.listFiles();
//for (File f:listaFisiere){
//    System.out.println(f);
//}
//
//        Agenda ag = new Agenda();
//        ag.populeazaDb();
//        for (Persoana p1 : ag.getListaContacte()) {
//            System.out.println(p1.getNume());
//        }
//        ag.adaugaContact(p2);
//        System.out.println(ag.getListaFiltrata());
//            ag.filtreazaPersonalizat("z");
//            ag.contacte();
        //System.out.println(ag.getListaFiltrata().toString());
//        int n;
//        int perechi;
//        int[] ar;
//        n = (int) (Math.random() * 1000) + 1;
//        ar = new int[n];
//        System.out.println(n);
//        for (int i = 1; i <= n; i++) {
//            ar[i - 1] = (int) (Math.random() * 1000) + 1;
//        }
//        System.out.println(Arrays.toString(ar));
//        for (int i : ar) {
//            if (i == i + 1) {
//            }
//        }
        File file = new File(".\\listaContacte.txt");
        Agenda ag = new Agenda(file.toPath());
        //System.out.println(ag.getListaContacte());
        //ag.incarca(file.toPath());
        System.out.println(ag.getListaContacte());

    }
}
