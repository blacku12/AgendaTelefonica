package pachetAgenda;

import java.sql.Date;
import java.time.LocalDate;

public class Util {

    public static String transformaNume(String nume) {
        nume = nume.trim().toLowerCase();
        nume = nume.substring(0, 1).toUpperCase() + nume.substring(1);;
        return nume;
    }

    public static LocalDate transformaData(String data) {
        data = data.trim();
        String zi = data.substring(6);
        String luna = data.substring(4, 6);
        String an = data.substring(0, 4);

        LocalDate ld = LocalDate.of(Integer.parseInt(an), Integer.parseInt(luna),
                Integer.parseInt(zi));
        return ld;
    }

    public static LocalDate transformaDataStandard(String data) {
        data = data.trim();
        String zi = data.substring(8);
        String luna = data.substring(5, 7);
        String an = data.substring(0, 4);

        LocalDate ld = LocalDate.of(Integer.parseInt(an), Integer.parseInt(luna),
                Integer.parseInt(zi));
        return ld;
    }

    public static LocalDate transformaData(Date data) {
        return data.toLocalDate();
    }

}
