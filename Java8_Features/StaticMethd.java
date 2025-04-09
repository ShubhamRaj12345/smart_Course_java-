package Java8_Features;

// this is a static method
interface  I1{
    void m1();

    static  void fun()
    {
        System.out.println("this is a static method ");
    }

}
public class StaticMethd {
    public static void main(String[] args) {

         I1 .fun();
    }
}
