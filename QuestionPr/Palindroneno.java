package QuestionPr;

public class Palindroneno {
    public static void main(String[] args) {

        int no=12321;
         int temp = no;
        int rev=0, rem;
        while (temp!= 0)
        {
            rem= temp %10;
            rev = rev * 10 + rem;
             temp= temp/10;

        }

        System.out.println("reverse no "+rev);

        if(temp == rev)
        {
            System.out.println("no is palindrone not palindrone  ");
        }
        else {
            System.out.println("no is palindrone ");
        }
    }


}
