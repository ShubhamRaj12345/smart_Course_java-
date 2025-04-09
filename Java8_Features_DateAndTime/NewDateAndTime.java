package Java8_Features_DateAndTime;

// this is related to date
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class NewDateAndTime {
    public static void main(String[] args) {

        // yaha object nahi create kar rahe hai
        LocalDate id1 = LocalDate.now();// default format hai YYYY-mm-dd
        System.out.println(id1);

        // for create my own format
        LocalDate ob = LocalDate.now();
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String format = tf.format(ob);
        System.out.println(format);

        // get day of month // means aj ki date
        LocalDate on = LocalDate.now();
        int dayOfMonth = on.getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println(on.isLeapYear());

        // for ye date me days minus karegaa
        LocalDate minus = on.minusDays(9);
        System.out.println(minus);

        // for month me plus karna
        LocalDate localDate = on.plusMonths(4);
        System.out.println(localDate);


    }
}
