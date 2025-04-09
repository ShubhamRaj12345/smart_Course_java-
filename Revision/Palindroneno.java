package Revision;

public class Palindroneno {
    public static void main(String[] args) {
        int no= 12321;

        int  revNo= 0;
        int temp = no;
        while (temp != 0){ // jab tak temp 0 nahi ho jata
            int rem = temp % 10;
            revNo = revNo * 10 + rem;
            temp = temp /10;
        }
        if(temp == revNo)
        {
            System.out.println("not a Palindrone ");
        }
        else {
            System.out.println(" palindrone no ");
        }
    }
}
