package java8_MethodReference;
// this is a constructor reference
interface  I1
{
    void m1();
}
class A4
{
    A4()
    {
        System.out.println("This is a constructor reference ");
    }
}
public class ConstructorRef {
    public static void main(String[] args) {

        I1 i = A4 :: new;
        i.m1();
    }
}
