package Java8_Features;
// yaha mai lamda ex use kiya hu
interface  I2
{
    void testing();
}
public class LamdaEx2 {
    public static void main(String[] args) {
        // ye interface ke  veriable i ke andar   store kiya hai
        I2 i = ()->{
            System.out.println("this is a Lamda method");

        };
        i.testing();
    }
}
