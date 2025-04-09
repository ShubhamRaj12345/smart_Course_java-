package Java8_Features2;

import java.util.function.Function;
//fUNCTION KE ANDAR APPLY METHOD KO USE KIYA HAI
public class Function12 {
    public static void main(String[] args) {


        Function<Integer , Integer> f = sal -> sal* 12;
        System.out.println(f.apply(1000)+" lpa");
    }
}
