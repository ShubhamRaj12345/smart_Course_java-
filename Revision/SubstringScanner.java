package Revision;

import java.util.Scanner;

public class SubstringScanner {
    public static void main(String[] args) {
        System.out.println("Enter The First String ");
        Scanner sc = new Scanner(System.in);
        String name=  sc.nextLine();
        System.out.println("Enter the Second String");

        String name2= sc.nextLine();
        char s= name.charAt(0);
        char s1= name.charAt(name.length()-1);
        String concate= String.valueOf(s)+ String.valueOf(s1);
        System.out.println(concate);

        char s2 = name2.charAt(0);
         char s22 = name2.charAt(name2.length()-1);

      String concate2 = String.valueOf(s2)+ String.valueOf(s22);
        System.out.println(concate2);


    }
}
