package date.type;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

/**
 * There're 2 class :
 * 1. Date : is used to representation date until milisecond
 * 2. Calender : is used to manipulate date until milisecond
 */
public class DateApp {
    public static void main(String[] args) {
        // currently Date just receive Unix time, other is deprecated
        Date dt = new Date();

        // Calender
        Calendar cl = Calendar.getInstance(); // default timestamp in local time
        // replace
        cl.set(Calendar.YEAR, 2023);
        cl.set(Calendar.MONTH, Calendar.JANUARY); // start from 0 : Janurary
        cl.set(Calendar.DATE, 1);
        cl.set(Calendar.HOUR, 0);
        cl.set(Calendar.MINUTE, 1);
        cl.set(Calendar.SECOND, 2);
        cl.set(Calendar.MILLISECOND, 0);

        // calculation
        cl.add(Calendar.YEAR, -1);

        // distance
        long days = Duration.between(cl.toInstant(), Calendar.getInstance().toInstant()).toDays();
    }
}
