package Revision;

public class ReverseANuber {
    public static void main(String[] args) {

        int no= 94765334;

       int  revNo= 0;
        while (no != 0){
            int rem = no % 10;
            revNo = revNo * 10 + rem;
            no = no /10;
        }
        System.out.println("reverse a number is "+ revNo);
    }
}

// steps 1 gte the last digits one by  one - remainder
// step 2  variable Lenge reverNumber = 0
                         // (reverNumber * 10 + remainder)
// setp 3 get Quotient