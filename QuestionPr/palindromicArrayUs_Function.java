package QuestionPr;

import java.util.Scanner;

public class palindromicArrayUs_Function {
    public  static  void palinDromic(int arr[]){
        int n = arr.length;
        System.out.println(n);
        int flg=0;

        for (int i =0;i<n/2;i++)
        {
            if(arr[i] != arr[n-i-1])
            {
                flg= 1;
                System.out.println("Not a Palindromic");
            }
        }
        if (flg== 0)
        {
            System.out.println("This is a palindromic");
        }
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size = sc.nextInt();

        int arr[]= new int[size];
     //   int arr[]= {1,2,3,2,1};
        System.out.println("Enter the Array Element");
        for (int i = 0; i<arr.length;i++)
        {
             arr[i]= sc.nextInt();
        }
        palinDromic(arr);
    }
}
