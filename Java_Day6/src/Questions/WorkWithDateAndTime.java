package Questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class WorkWithDateAndTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("Date : "+d);
        LocalTime t = LocalTime.now();
        System.out.println("Time : "+t);
        LocalDateTime ld = LocalDateTime.now();
        System.out.println("Date & Time : "+ld);
        /*
        display the day of year
         */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("DD, MMM dd,yyyy");
        String fd = d.format(dateTimeFormatter);
        System.out.println("Formatted Date and Time : "+fd);
    }
}
