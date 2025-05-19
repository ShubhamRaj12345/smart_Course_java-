package Java8_Features_DateAndTime;
// America ka date and Time

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TimeZone;

public class ZoneId {
    public static void main(String[] args) {
        java.time.ZoneId z = java.time.ZoneId.of("America/New_York");
        LocalDate lc = LocalDate.now(z);
        System.out.println(lc);

        //ye america ka time hai
        LocalTime ld = LocalTime.now(z);
        System.out.println(ld);


        // for all time Zone

        String[] availableIDs = TimeZone.getAvailableIDs();

        for (String a : availableIDs)
        {
            System.out.println(a);
        }

        // for currrent SYstem Defalut Zone

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
    }
}
