package Java8_Features;

interface  Lamda12
{
   // void funn(int a ,int b );

    void funn2(int a );
}

public class LamdaEx5 {

        public static void main(String[] args) {

        //    Lamda12 t = (a,b)-> System.out.println(a+b); // agr ek hi statement hai to { } sout me ye lgana jarroi nahi
          //  t.funn(10,20);


            // agr single parametr hai to bracaket hata sakte hai

       Lamda12 t1=  a-> System.out.println(a*a);
       t1.funn2(10);

        }
    }


