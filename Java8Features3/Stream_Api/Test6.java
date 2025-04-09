package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// wap to sum of all the even number in an array list
public class Test6 {
    public static void main(String[] args) {
        ArrayList<Integer> it = new ArrayList<>();
        it.add(12);
        it.add(3);
        it.add(6);
        it.add(111);
        it.add(2);

        Stream<Integer> s= it.stream();
      int res = s.filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();// method reference ka features hai
        System.out.println(res);


    }
}
