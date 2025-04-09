package Generics;

import java.util.ArrayList;
// pahle ArrayList Collection type safe nahi the 1.5 ke bah type safe hop gya
public class ArrayList1 {
    public static void main(String[] args) {
       /* ArrayList al = new ArrayList();
        al.add(1);
        al.add("shubham");

      String a = (String)al.get(2); // pahle arraylist me type cast karna padta tha 1.5 ke badh generics aaya
        */

        ArrayList<String> st = new ArrayList<>();
        st.add("sh");

        String sty= st.get(0);
        System.out.println(sty);
    }

}
