package JavaDateAndTime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Result {

    public static String findDay(int month, int day, int year) {

        return LocalDate.of(year, month, day).getDayOfWeek().name().toUpperCase();

//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.MONTH,month-1);
//        cal.set(Calendar.DAY_OF_MONTH,day);
//        cal.set(Calendar.YEAR,year);
//        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.UK).toUpperCase();
//        return dayOfWeek;
    }

}
