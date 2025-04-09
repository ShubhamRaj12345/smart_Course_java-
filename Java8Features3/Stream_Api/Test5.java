package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.stream.Stream;

// write a program to replace a with z
public class Test5 {
    public static void main(String[] args) {

        String sy = "hs";
        String replace = sy.replace("s", "dwe");
        System.out.println(replace);


        // through Stream Api

        ArrayList<String> le = new ArrayList<>();
        le.add("shubham");
        le.add("sss");
        le.add("lkkkkl");
        le.add("dhhh");
        Stream <String > st = le.stream();
        st.map(e-> e.replace("d","z")).forEach(e-> System.out.println(e));

    }
}
