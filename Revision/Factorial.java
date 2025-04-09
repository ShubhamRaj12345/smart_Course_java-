package Revision;
// factorial no
public class Factorial {
    public static void main(String[] args) {

        int no = 5;
        int fact = 1;
        for (int i = 1; i<=no;i++)
        {
            fact = fact *i; //1*1  1*2   1*3   1* 4
        }
        System.out.println("Factorial no of "+no+" is "+fact);
    }
}
