package pachetAgenda;

import java.time.LocalDate;

public class Verifica {

    public static boolean formatnume(String nume) {
        boolean status = false;
        nume = Util.transformaNume(nume);
        char[] caractereNume = nume.toCharArray();
        for (char c : caractereNume) {
            if (!Character.isAlphabetic(c)) {
                status = false;
                break;
            }
            status = true;
        }
        return status;
    }

    public static boolean marimeNume(String nume, int min, int max) {
        return ((nume.length() >= min) && (nume.length() < max));
    }

    public static boolean verificaData(LocalDate data) {
        return verificaAn(data) && verificaLunaDinAn(data) && verificaExistentaLuna(data) && verificaExistentaZi(data);
    }

    public static boolean verificaAn(LocalDate data) {
        return data.getYear() < LocalDate.now().getYear();
    }

    public static boolean verificaLunaDinAn(LocalDate data) {
        return data.getYear() == LocalDate.now().getYear() && data.getMonthValue() < LocalDate.now().getMonthValue() 
                || data.getYear() < LocalDate.now().getYear();
    }

    public static boolean verificaExistentaLuna(LocalDate data) {
        return data.getMonthValue() >= 1 && data.getMonthValue() <= 12;
    }

    public static boolean verificaExistentaZi(LocalDate data) {
        return data.getDayOfMonth() >= 1 && data.getDayOfMonth() <= 31;
    }
    
}
