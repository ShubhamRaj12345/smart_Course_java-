package Inheritance;
// single Inheritance
class A
{
    void show1(){
        System.out.println("This is aa single ingheritance");
    }
}
class  B extends  A
{
    void show2(){
        System.out.println("This is a show 2");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        B ob = new B();
        ob.show1();
        ob.show2();

    }
}
