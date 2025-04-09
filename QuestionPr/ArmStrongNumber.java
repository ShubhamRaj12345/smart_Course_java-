package QuestionPr;

public class ArmStrongNumber {
    public static void main(String[] args) {

        int no = 153; // 1*1*1 // 2*2*2

        int temp= no;
        int lenth = 0;
        while (temp !=0)
        {
            lenth = lenth +1;

            temp= temp /10;

        }
        int temp2 = no;
        int rem ;
        int sum= 0;
        while (temp2 != 0)
        {
            rem = temp2 % 10;

            temp2 = temp2/10;

            int mul =1;
            for (int i = 0; i<lenth;i++)
            {
                mul = mul* rem;

            }
            sum = sum +mul;
        }
        if (no == sum)
        {
            System.out.println(no+" is armstrong number");
        }else {
            System.out.println(no+" not armstrong no");
        }
    }
}
