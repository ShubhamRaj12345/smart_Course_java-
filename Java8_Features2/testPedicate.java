package Java8_Features2;
// this is a Predicate
import java.util.function.Predicate;
// ye bina Prediate ke Even no find kar raha hu
interface  I1
{
    public boolean test(int no);
}

class  A implements  I1
{

    @Override
    public boolean test(int no) {

       // int i = no%2;
     //   return  i==0;


        return no % 2 ==0;
    }
}
public class testPedicate {
    public static void main(String[] args) {

        I1 ob = new A();
        System.out.println(ob.test(20));
    }
}
