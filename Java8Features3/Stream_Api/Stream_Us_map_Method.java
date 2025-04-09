package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.stream.Stream;

// Writea program to print the square of each number  // yaha map ko use karenge  // filter method ka use nahi kar sakte hai
public class Stream_Us_map_Method {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
         al.add(12);
         al.add(10);
         al.add(30);
         al.add(40);
         al.add(60);

        Stream<Integer> st = al.stream();
       st .map(et-> et * et ).forEach(et-> System.out.println(et));
    }
}
