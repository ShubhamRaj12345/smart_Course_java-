package Generics;
// ye hai generic class// ab constructor me kuch bhi daaal sakte hai

class A<T > // ye kuch bhi ho sakta hai
{
    T a ;
    A(T a)
    {
        this.a = a;
    }

    void show()
    {
        System.out.println(a);
    }
}

public class Generic_Classes {
    public static void main(String[] args) {

        A<String> ob = new A<String>("sd");
        ob.show();

        A <Integer> at = new A<>(123);
        at.show();
    }
}
