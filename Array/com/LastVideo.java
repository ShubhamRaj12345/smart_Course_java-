package Array.com;

import java.util.Scanner;

public class LastVideo {
    public static void main(String[] args) {
        System.out.println("Enter the size of an  Array ");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i =0;i<size;i++)
        {
            System.out.println("Enter Number "+(i+1)); // is se har baar increse hoga
             arr[i]= sc.nextInt();
        }
        for (int i = 0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
