package Java8_Features;
// Default Method in java
interface  T
{
    void fun();
    void fun1();
// this is a default method
    default void defMethod()
    {
        System.out.println("This is a default method ");
    }
}
public class test implements  T
{
    @Override
    public void fun() {
        System.out.println("Hello");
    }

    @Override
    public void fun1() {
        System.out.println("Hii");
    }

    public static void main(String[] args) {

      test t = new test();
      t.fun();
      t.fun1();
      t.defMethod();
    }


}
