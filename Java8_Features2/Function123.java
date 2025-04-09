package Java8_Features2;

import java.util.function.Function;

// Function String .concate ka use kiya hai
public class Function123 {
    public static void main(String[] args) {

        Function <String , String > str = f-> f.concat("Is a java Developer");

        System.out.println(str.apply("shubham "));
        System.out.println(str.apply("amit "));
    }
}
