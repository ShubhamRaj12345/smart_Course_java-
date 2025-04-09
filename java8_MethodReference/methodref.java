package java8_MethodReference;
interface  I4
{
    void m1();
}
class S2
{
    void m2(){
        System.out.println("This is a method referene 2");
    }
}
public class methodref {
    public static void main(String[] args) {

     S2 ob = new S2();
     I4 t = ob:: m2;
     t.m1();
    }
}
