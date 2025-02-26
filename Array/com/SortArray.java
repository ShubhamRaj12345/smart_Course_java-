package Array.com;

import java.util.Arrays;
//yaha maine arraay ke element ko sort kiya hai
public class SortArray {
    public static void main(String[] args) {
        int  arr[]= {10,121,1,2334,50};
        Arrays.sort(arr);

        for (int i : arr)
        {
            System.out.println(i);
        }
    }
}
