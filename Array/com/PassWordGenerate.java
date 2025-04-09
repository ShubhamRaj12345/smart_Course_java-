package Array.com;

import java.util.Scanner;
// print 1st and last character
public class PassWordGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name ");
      String  name=   sc.next();
        System.out.println("Enter dob");

        String dob = sc.next();
        String newname;
        char c = name.charAt(0); // ye 1 char ko get kar dega retutn kar dega
       // System.out.println(c);
        if (c=='a' || c== 'e' || c== 'i' || c== 'o' || c== 'u')
        {
             newname= name.substring(1,3);
        //    System.out.println(newname);
        }
        else
        {   // deepak   // isme 1st and last caracter print hoga
            char s= name.charAt(0);
            char s2= name.charAt(name.length()-1);
            newname= String.valueOf(s)+ String.valueOf(s2); // ye concate hua hai
        }
        System.out.println(newname);


    }
}
