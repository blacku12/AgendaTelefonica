package pachetAgenda;

public class NrFix extends NrTel {

    public NrFix(String nr) {
        super(nr);
    }

    @Override
    public boolean validareNumar(String n) {
        if (!(n.startsWith("02") || n.startsWith("03"))) {
            throw new IllegalArgumentException("Numarul trebuie sa inceapa cu 02 sau 03");
        }
        return true;
    }

}
