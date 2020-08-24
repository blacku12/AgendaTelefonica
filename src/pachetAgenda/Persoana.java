package pachetAgenda;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public final class Persoana implements Serializable {
    
    private int id;
    private String nume;
    private String prenume;
    private LocalDate data;
    private NrTel nrFix;
    private NrTel nrMobil;
    private static final int NR_MIN_CARACTERE = 2;
    private static final int NR_MAX_CARACTERE = 20;
    
    public Persoana(String n, String p, LocalDate d, NrFix nrTel) {
        this.setNume(n);
        this.setPrenume(p);
        this.setData(d);
        this.setNrFix(nrTel);
        this.setNrMobil(new NrMobil(""));
    }
    
    public Persoana(String n, String p, LocalDate d, NrMobil nrTel) {
        this.setNume(n);
        this.setPrenume(p);
        this.setData(d);
        this.setNrMobil(nrTel);
        this.setNrFix(new NrFix(""));
    }
    
    public Persoana(String n, String p, LocalDate d, NrFix nrFix, NrMobil nrMobil) {
        this(n, p, d, nrFix);
        this.setNrMobil(nrMobil);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNume() {
        return nume;
    }
    
    public String getPrenume() {
        return prenume;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public NrTel getNrFix() {
        return nrFix;
    }
    
    public NrTel getNrMobil() {
        return nrMobil;
    }
    
    public void setNume(String nume) {
        validareNume(nume);
        nume = Util.transformaNume(nume);
        this.nume = nume;
    }
    
    private static void validareNume(String nume) {
        if (!Verifica.formatnume(nume)) {
            throw new IllegalArgumentException("Nume/prenume incorect, trebuie sa contina doar litere");
        }
        if (!Verifica.marimeNume(nume, NR_MIN_CARACTERE, NR_MAX_CARACTERE)) {
            throw new IllegalArgumentException("Nume/prenume incorect, trebuie sa "
                    + "contina intre " + NR_MIN_CARACTERE + " si " + NR_MAX_CARACTERE + " de caractere");
        }
    }
    
    public void setPrenume(String prenume) {
        validareNume(prenume);
        prenume = Util.transformaNume(prenume);
        this.prenume = prenume;
    }
    
    public void setData(LocalDate data) {
        if (!Verifica.verificaData(data)) {
            throw new IllegalArgumentException("Data este incorecta");
        }
        this.data = data;
    }
    
    public void setNrFix(NrTel nr) {
        this.nrFix = nr;
    }
    
    public void setNrMobil(NrTel nr) {
        this.nrMobil = nr;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nume);
        hash = 41 * hash + Objects.hashCode(this.prenume);
        hash = 41 * hash + Objects.hashCode(this.data);
        hash = 41 * hash + Objects.hashCode(this.nrFix);
        hash = 41 * hash + Objects.hashCode(this.nrMobil);
        return hash;
    }
    
    @Override
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (getClass() != p.getClass()) {
            return false;
        }
        final Persoana other = (Persoana) p;
        if (!Objects.equals(this.nume, other.nume)) {
            return false;
        }
        if (!Objects.equals(this.prenume, other.prenume)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.nrFix, other.nrFix)) {
            return false;
        }
        if (!Objects.equals(this.nrMobil, other.nrMobil)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return prenume + ", " + nume + ", " + nrFix + ", " + nrMobil + ", " + data;
    }
}
