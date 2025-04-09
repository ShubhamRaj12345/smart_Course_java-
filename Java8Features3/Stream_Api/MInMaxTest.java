package Java8Features3.Stream_Api;

import java.util.Arrays;

public class MInMaxTest {
    public static void main(String[] args) {
        int arr[]={12,3,4,556,78,2};
        int max= arr[0];
        for (int i = 0; i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element is "+max);




        // using strem Api
         Arrays.stream(arr).max().stream().forEach(e-> System.out.println(e));
    }
}
