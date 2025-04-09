package java8_MethodReference;
interface I5
{
    void m1();
}
class S6{

    public static void m3(){
        System.out.println("this is a static method reference ");
    }
}

public class StaticReference {
    public static void main(String[] args) {

        I5 i = S6:: m3;
        i.m1();
    }
}
