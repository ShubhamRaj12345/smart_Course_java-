package QuestionPr;
// yaha return ka use kiya hai
public class CaculateFactorial_Us_recursionReturn {

  static int fact = 1;
    int  calcuFcatorial(int no)
    {
       if(no >=1) {
           fact = fact * no;
           no = no - 1;
           calcuFcatorial(no);
       }

       return  fact;
    }


    public static void main(String[] args) {

      int no = 5;
        CaculateFactorial_Us_recursionReturn cl = new CaculateFactorial_Us_recursionReturn();

       int res= cl.calcuFcatorial(no);
        System.out.println("Factorial of "+no+" is "+res);
    }
}
