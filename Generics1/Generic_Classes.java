package Generics1;
// ye hai generic class// ab constructor me kuch bhi daaal sakte hai

class A<T , E , A> // ye kuch bhi ho sakta hai  // yaha kitna bhi paramter bhi pass kar sakte hai
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

        A<String ,Integer ,Long> ob = new A<String ,Integer ,Long>("Shubham");
        ob.show();

    }
}
