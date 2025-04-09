package Java8_Features;


interface  Lamda
{
    void funn(int a );
}
public class LamdaEx4 {

        public static void main(String[] args) {

         Lamda t = (a)-> System.out.println(a); // agr ek hi statement hai to { } sout me ye lgana jarroi nahi
            t.funn(10);
        }
    }


