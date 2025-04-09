package QuestionPr;

public class PrimeNumber {
    public static void main(String[] args) {

        int no = 7;
       int flag= 1;
        for (int i = 2; i<=no-1;i++)   // no/ 2 kar sakte hai
        {
            if (no % i == 0)
            {
                flag=2;
            }

        }
        if(flag==2)
        {
            System.out.println("this is not a prime ");
        }else {
            System.out.println("this is  prime");
        }


    }
}
