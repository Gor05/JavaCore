package medicalCentre.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public  static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    public  static final SimpleDateFormat SDTM = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static boolean isSameDay(Date day1, Date day2) {
     return  SDF.format(day1).equals(SDF.format(day2));
    }
}
