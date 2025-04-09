package Java8_Features2;

import java.util.function.Predicate;
//  ye maine predefined functional interaface ko us ekar ke  even banaya hai
public class EvenUS_Predicate {
    public static void main(String[] args) {

        Predicate<Integer> pr=  no -> no % 2 ==0;

        System.out.println(pr.test(13));
    }
}
