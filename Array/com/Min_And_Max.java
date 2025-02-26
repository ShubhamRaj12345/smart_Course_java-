package Array.com;

import javax.swing.*;
import java.util.Scanner;

public class Min_And_Max {

    public static void  minArray(int arr[])
    {
        int min= arr[0]; // first element ko minimum man liya  hai
        for (int i = 0;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min= arr[i];
            }
        }
        System.out.println("Minimum element is "+min);
    }

     // for maximum

    public static void maxArray(int arr[])
    {
        int max=arr[0];
        for (int j = 0;j< arr.length;j++)
        {

            if (arr[j]>max)
            {
                max = arr[j];
            }
        }
        System.out.println("Maximum element is "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arrray ");
        int size = sc.nextInt();
        int arr []= new int[size];
        System.out.println("Enter the array elemnet ");
        for (int i =0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

   //  int arr[]= {40,45,23,445,554,56,23,78,12,23,3,};
      minArray(arr);
       maxArray(arr);

    }

}
