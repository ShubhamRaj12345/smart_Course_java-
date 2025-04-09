package Java8_Features2;

import java.util.function.Predicate;

// find STrinng length us predicate
public class String_Length_US_predicate {
    public static void main(String[] args) {

        Predicate <String> st = len -> len.length() >4; //yaha sirf Boolean method hai isliye mai > than sign ka use kiya hu
        System.out.println(st.test("shubham"));
        System.out.println(st.test("sdj"));
    }
}
