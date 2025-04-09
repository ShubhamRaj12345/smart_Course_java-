package Java8Features3.Stream_Api;
// write a program to convert upper lower to upper case

import java.util.ArrayList;
import java.util.stream.Stream;

public class StringConver_UpperCase {
    public static void main(String[] args) {
        ArrayList<String > ar = new ArrayList();
        ar.add("shubham");
        ar.add("sonu");
        ar.add("khilesh");
        ar.add("ujjwal");
/* // using for each lop
        for (String i : ar)
        {
            System.out.println(i.toUpperCase());
        }*/

        Stream <String >at =ar.stream();
        at.map(up-> up.toUpperCase()).forEach(up-> System.out.println(up));
    }
}
