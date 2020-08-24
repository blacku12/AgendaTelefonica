package pachetAgenda;

public class NrMobil extends NrTel {

    public NrMobil(String nrTel) {
        super(nrTel);
    }

    @Override
    public boolean validareNumar(String n) {
        if (!n.startsWith("07")) {
            throw new IllegalArgumentException("Numarul mobil trebuie sa inceapa cu 07");
        }
        return true;
    }

}
