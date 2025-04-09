package Java8_Features2;

import java.util.function.Function;

public class Strig_length_Us_Function {
    public static void main(String[] args) {

        Function<String , Integer> ft = f -> f.length();

        System.out.println(ft.apply("shubham"));
        System.out.println(ft.apply("sonu"));
    }
}
