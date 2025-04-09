package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.stream.Stream;

// sort accoring to name  using stream
public class NameSort {
    public static void main(String[] args) {
        ArrayList ab = new ArrayList();

        ab.add("deepak");
        ab.add("add");
        ab.add("zzz");
        ab.add("ccc");

          // sorted in accending order
        Stream st = ab.stream();
        st.sorted().forEach(et-> System.out.println(et)); // ek baar me ek hi method chalge

        // sorted in decending order
       // st.sorted((x,y)-> x.compareTo(y)).forEach(e -> System.out.println(e));
    }
}
