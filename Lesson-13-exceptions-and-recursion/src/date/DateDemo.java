package date;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo {
    public static void main(String[] args) {
        System.out.println("current millis : " + System.currentTimeMillis());
        System.out.println("current date   : " + new Date());
        System.out.println("millis in Date : " + new Date().getTime());
        System.out.println("zero date      : " + new Date(0));

        System.out.println("\n+1 day : " + new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000));

        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar before : " + calendar.getTime());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DATE, 9);

        System.out.println("Calendar after : " + calendar.getTime());

        LocalDate.of(2020, 9, 9);

        System.out.println("local date : " + LocalDate.now());
        System.out.println("local time : " + LocalTime.now());
        System.out.println("local date-time : " + LocalDateTime.now());

        ZonedDateTime utc = LocalDateTime.of(1970, 1, 1, 0, 0, 0)
                .atZone(ZoneId.of("UTC"));

        System.out.println(utc);



        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        System.out.println("ldf format :: " + dtf.format(LocalDateTime.now()));
        System.out.println("ldf format :: " + dtf.format(utc));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        System.out.println("date format :: " + sdf.format(new Date()));

        LocalDateTime localDT = LocalDateTime.now();

        localDT.
    }
}
