package Inheritance;
// MULTILAVEL INHERITANCE
class  AB
{
    void fun()
    {
        System.out.println("This is a fun Calling ");
    }
}
class ABC extends  AB
{
    void fun2()
    {
        System.out.println("This is a fun2 Calling");
    }
}
class  ABCD extends ABC
{
    void fun3()
    {
        System.out.println("This is a fun3 Calling");
    }
}
public class Multilavel_Inheri {

    public static void main(String[] args) {

        ABCD obn = new ABCD();
        obn.fun();
        obn.fun2();
        obn.fun3();
    }
}
