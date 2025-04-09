package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.stream.Stream;
// min and maximum element in an array list
public class Max_Min_Us_Stream {
    public static void main(String[] args) {

        ArrayList<Integer> it = new ArrayList<>();
        it.add(12);
        it.add(3);
        it.add(6);
        it.add(111);
        it.add(2);

        // for minimum
        Stream<Integer> i = it.stream();
       /* Integer i1 = i.min((x, y) -> x.compareTo(y)).get();
        System.out.println("minimum element is "+i1);*/

        // for maximum
        Integer i2 = i.max((x, y) -> x.compareTo(y)).get();
        System.out.println("Maximum element is "+i2);
    }
}
