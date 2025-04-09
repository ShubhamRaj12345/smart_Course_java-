package Java8_Features2;

import java.util.function.Predicate;

// find STrinng length us predicate
public class String_Length_US_predicate2 {
    public static void main(String[] args) {

        Predicate <String> st = len -> len.length() >4;
        Predicate <String > st2 = len-> len.equals("admin@hgmail.com");
        System.out.println(st.test("shubham"));
        System.out.println(st2.test("admin@hgmail.c"));  // ye dono method ko compair kar raha hai


        // ismme dono condition check kiya hai fhir answer dega
        Predicate p = st.and(st2);
        System.out.println(p.test("admin@"));


        // isme sirf koi ek true hai to true return kar dega
        Predicate p1 = st.or(st2);
        System.out.println(p1.test("admin@hgmail.com"));
    }
}
