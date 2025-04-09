package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// print even number in an ArrayList
public class PrintEvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        all.add(22);
        all.add(45);
        all.add(30);
        all.add(75);
        all.add(2);
        all.add(80);
        all.add(93);

        for (int i : all)
        {
            if (i % 2 ==0)
            {
                System.out.println(i);
            }
            System.out.println("This is  a method 2 by Using Stream api ");
      // 2 method 2 using Stream Api
            Stream <Integer> s = all.stream(); // pahle get kiya hai
            List<Integer> collect = s.filter(e -> e % 2 == 0).collect(Collectors.toList());
            System.out.println(collect);
        }

        // method 3  using Stream this method is short
        System.out.println("_________________Method 3 ye maine Stream APi se short kiya hai ");
        Stream <Integer> s2 = all.stream();
        s2.filter(e1 -> e1 % 2==0).forEach(e1-> System.out.println(e1));

     // aur short kiya is

        all.stream().filter(et-> et % 2== 0).forEach(et-> System.out.println(et));

        //  wap to count all Even number
        System.out.println("Even number count kiya hai ___________________________________");
        long count = all.stream().filter(co -> co % 2 == 0).count();
        System.out.println(count);

        // method 2 for print count
        System.out.println(all.stream().filter(co -> co % 2 == 0).count());


        // write a program to print number greater  than  10
        List<Integer> collect = all.stream().filter(gr -> gr > 10).collect(Collectors.toList());
        System.out.println(collect);

        // method 2
        System.out.println("method 2 greater than 30 element ");
        all.stream().filter(c-> c>30).forEach(e-> System.out.println(e));


        /*for (int i = 0;i< all.size();i++)
        {
            System.out.println(all.get(i));
        }*/


    }
}
