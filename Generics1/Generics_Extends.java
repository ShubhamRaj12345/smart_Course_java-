package Generics1;
//

class D<T extends Number> // ye maine bound kar diya hai  ab sirf number hi lega

{
    void show(T b )
    {
        System.out.println(b);
    }
}
public class Generics_Extends {
    public static void main(String[] args) {
        D<Integer> dt = new D<>();
        dt.show(12);

       // D<String> dr = new D<>(); ye galat hai
    }
}
