package QuestionPr;

public class CaculateFactorial_Us_recursion {

  static int fact = 1;
    void calcuFcatorial(int no)
    {
       if(no >=1) {
           fact = fact * no;
           no = no - 1;
           calcuFcatorial(no);
       }
    }


    public static void main(String[] args) {

      int no = 5;
        CaculateFactorial_Us_recursion cl = new CaculateFactorial_Us_recursion();

        cl.calcuFcatorial(no);
        System.out.println("Factorial of "+no+" is "+fact);
    }
}
