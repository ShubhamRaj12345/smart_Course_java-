package Java8_Features;
interface  I6
{
    int getLength(String r);
}
public class LamdaStringLength6 {
    public static void main(String[] args) {
/*
     I6 i =   (r)->{

      int leng  =    r.length();
      return  leng;
        };
  int o=    i.getLength("shubham");
        System.out.println("Legth is "+o);

    }*/

        // code ko aur chota kiya hai
        I6 i1 = r -> {

            return r.length();
        };

        System.out.println("Length is "+i1.getLength("shubham"));



    // code ko aur chota kiya hai

    I6 i = r -> r.length();
    //   return  r.length();  // agr single return hai to return ko bhi likhene ki jaroort nahi hai


        System.out.println("Length is "+i.getLength("shubham"));
}
}

