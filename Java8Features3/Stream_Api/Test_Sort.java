package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// sort an arraylist containg inerger value
public class Test_Sort {
    public static void main(String[] args) {

        int arr[]={10,2,3,56,67,8,454};
          Arrays.sort(arr);

          for (int i : arr)
          {
              System.out.print(i+" ");
          }

        System.out.println();
          // maine is se bhi sort kar diya hai
           Arrays.stream(arr).sorted().forEach(e-> System.out.print(e+" "));


        System.out.println();


        // sort using Stream api
        ArrayList<Integer> it = new ArrayList<>();
          it.add(12);
          it.add(3);
          it.add(6);
          it.add(111);
          it.add(2);

        Stream ob = it.stream();
        ob.sorted().forEach(e-> System.out.print(e+" "));

    }
}
