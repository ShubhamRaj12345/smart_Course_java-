package Java8Features3.Stream_Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
// Stream Api
// how to get  Stream Instance
public class StreamAPi1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(20);
        al.add(30);
        al.add(50);
        al.add(70);
        al.add(90);
        // 1 St  way to get Stream Instance
        Stream<Integer> stream = al.stream();
         stream.forEach(e -> System.out.println(e));
        System.out.println("____________________________________________________________");
         // 2nd way to get Stream instance through static method

     Stream s2=  Stream.of(al);
     s2.forEach(er -> System.out.println(er));
        System.out.println("________________________________________________________________");

     // 3 rd Way to print
       Stream str=  Stream.of(100,23,45,67,8);
       str.forEach(rt -> System.out.println(rt));

       //
        Stream str1=  Stream.of("shubham","khilesh ");
        str1.forEach(rt1 -> System.out.println(rt1));
        System.out.println("___________________________________________________");
        // 5 th way to get Stream instance
        int arr[]={200,300,4,5,6,7,6};

        IntStream stream1 = Arrays.stream(arr);
        stream1.forEach(et-> System.out.println(et));
        System.out.println(stream1);

        System.out.println("_______________________________________________________________");
        //6th way to create
       Stream s6=  Stream.builder().build();

    }
}
