package Array.com;

public class Array_Even_and_Old {
    public static void main(String[] args) {
        int a[]= {2,34,56,34,4,7,8,1,3,2,4,4};

   // check no of even and odd
        int evencount=0; int oddcount=0;
        for (int i = 0 ;i<a.length;i++) {

            if (a[i] % 2 == 0) {

                evencount = evencount + 1;

                System.out.println("Even no is"+a[i]);
            } else {
                System.out.println("Odd Number is "+a[i]);
                oddcount = oddcount + 1;
            }
        }
        System.out.println("__________________________________________________");
            System.out.println("No of even number is "+evencount);
            System.out.println("No of odd number is "+oddcount);

        }
    }

