package Java8_Features_DateAndTime;

import java.time.Year;

public class Test5 {
    public static void main(String[] args) {

        Year y = Year.now();
        System.out.println(y.isLeap());
    }
}
