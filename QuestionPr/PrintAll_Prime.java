package QuestionPr;
// print all 1 to 100 prime no
public class PrintAll_Prime {
    public static void main(String[] args) {

        for(int no = 2;no<=100;no++)
        {
            boolean b = false ;
            for (int i = 2;  i<=no-1;i++)
            {
                if(no % i ==0)
                {
                    b=true;
                }
            }
            if (b== false){
                System.out.println(no);
            }
        }
    }
}
