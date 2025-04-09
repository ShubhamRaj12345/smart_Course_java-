package Revision;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {

        int arr[]={12,23,4,5,45,67};

        int  a = arr.length;
        int max= arr[0];
        for (int i = 0 ;i<a;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];

            }

        }
        System.out.println(max);
    }
}
