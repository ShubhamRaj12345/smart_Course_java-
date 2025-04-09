package Java8_Features_DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

//ye Date util package  me hai jo ki old ho gaya hai
public class OldDate {
    public static void main(String[] args) {
  // ye maine curent date show kiya but ab mai format karna chahta hu
        Date d = new Date();
        System.out.println(d);

        // for format
        SimpleDateFormat mt =new SimpleDateFormat("dd/MM/yyyy");
        String format = mt.format(d);
        System.out.println(format);

        // method 2
        SimpleDateFormat ob = new SimpleDateFormat("dd-MM-YY");

        String format1 = ob.format(d);
        System.out.println(format1);

        // for current time
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");// HH provide 24 hours // hh provides 12 hours
        String format2 = time.format(d);
        System.out.println(format2);
    }
}
