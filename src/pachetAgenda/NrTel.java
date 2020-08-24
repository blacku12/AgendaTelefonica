package pachetAgenda;

import java.io.Serializable;
import java.util.Objects;

public abstract class NrTel implements Comparable<NrTel>, Serializable {

    private String nrTel;

    public NrTel(String nrTel) {
        if (!"".equals(nrTel)) {
            try {
                long nr = Long.parseLong(nrTel);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Numarul trebuie sa fie format doar din cifre");
            }
            if (nrTel.length() != 10) {
                throw new IllegalArgumentException("Numarul de telefon trebuie sa aiba 10 cifre");
            }
            validareNumar(nrTel);
        }
        this.nrTel = nrTel;
    }

    public String getNrTel() {
        return nrTel;
    }

    public abstract boolean validareNumar(String n);

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nrTel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NrTel other = (NrTel) obj;
        if (!Objects.equals(this.nrTel, other.nrTel)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(NrTel t) {
        if ("".equals(this.nrTel) || "".equals(t.nrTel)) {
            return 1;
        }
        int n = Integer.parseInt(t.getNrTel());
        int nrTel = Integer.parseInt(this.nrTel);
        if (n < nrTel) {
            return -1;
        } else if (n > nrTel) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return nrTel;
    }
}
