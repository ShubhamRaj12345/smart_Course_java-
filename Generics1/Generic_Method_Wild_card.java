package Generics1;
// Generic method And wildcard ye multiple datatype accept kar sakta hai
import java.util.ArrayList;

class As
{
    void sum(ArrayList<?> ar)
    {
        System.out.println(ar);
    }
}
public class Generic_Method_Wild_card {
    public static void main(String[] args) {

        As ab = new As();

        ArrayList<String> st = new ArrayList<>();

        ab.sum(st);


        ArrayList<Integer> it= new ArrayList<>();

        ab.sum(it);
    }
}
