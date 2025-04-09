package Generics1;
class S<T>
{
    void show(T b )
    {
        System.out.println(b);
    }
}
public class GenericClass_method {
    public static void main(String[] args) {
        S<String> st = new S<>();
        st.show("sshubham");

        S<Integer> it = new S<>();
        it.show(12);
    }

}
