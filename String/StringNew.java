package String;

import java.util.Locale;

public class StringNew {
    public static void main(String[] args) {


    String str ="khilesh";
    String str4 = "shubham";

    char c = str.charAt(0);
  //  char chh = str.charAt(2);
    char ch = str.charAt(str.length() -1);

    String str2= str.valueOf(c) + str.valueOf(ch);
    System.out.println(str2);


        System.out.println(str.substring(1,4));
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(str4));

}
}
