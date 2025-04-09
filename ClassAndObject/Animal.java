package ClassAndObject;

public class Animal {

    int a = 20 ;

    public void eat()
    {
        System.out.println("Animal is eating");
    }

    void eating()
    {
        System.out.println("eating is calling ");
    }
    public static void main(String[] args) {

        Animal ab = new Animal();
       int i =  ab.a= 10;
        System.out.println(i);

        Animal b = new Animal();
        System.out.println(b.a=40);
             b.eating();
    }
}
