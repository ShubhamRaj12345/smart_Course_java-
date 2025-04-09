package Java8_Features;
interface  Te
{
    void funn();
}
public class LamdaEX3 {
    public static void main(String[] args) {

        Te t = ()-> System.out.println("this is a Lamda Expression"); // agr ek hi statement hai to { } sout me ye lgana jarroi nahi
        t.funn();
    }
}
