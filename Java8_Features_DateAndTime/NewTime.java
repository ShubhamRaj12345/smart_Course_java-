package Java8_Features_DateAndTime;

// this is a LocalTime  for time ke liye

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class NewTime {
    public static void main(String[] args) {

        LocalTime ob = LocalTime.now();
        System.out.println(ob);


        // for format
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:ss");
        String format = dt.format(ob);
        System.out.println(format);

        // for getting only hours
        LocalTime on = LocalTime.now();
        System.out.println(on.getHour());
        System.out.println(on.minusHours(40));
    }
}
