package Array.com;

import java.util.Scanner;

public class Aray1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email");
        String  email= sc.next();
        System.out.println("Enter password");
        String password = sc.next();

        if (email.equals("shubhamraj@gmail.com") && password.equals("12345"))
        {
            String name = "shubham raj"; // name come from database
            int age = 23;
            String address= "bihar";
            String  dob = "01/01/2001";

            Profile p = new Profile(name , age , address,dob);
            p.display();

        }
        else {
            System.out.println("Email and password did'not match ");
        }
    }
}
