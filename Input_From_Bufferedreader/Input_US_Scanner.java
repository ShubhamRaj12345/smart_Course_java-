package Input_From_Bufferedreader;

import java.util.Scanner;

public class Input_US_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str = sc.nextLine();
        System.out.println("enter your age ");
        int b  = sc.nextInt();

         sc.nextLine();
        System.out.println("enter your address");
        String ad = sc.nextLine();


    }
}
