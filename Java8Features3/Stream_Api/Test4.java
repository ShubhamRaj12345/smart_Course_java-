package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.stream.Stream;

// wap to print the first character of each name
public class Test4 {
    public static void main(String[] args) {

       /* String st[]= {"dhu","shd","dsj"};
        for (int i = 0;i<st.length;i++)
        {
            if (st[i].charAt(0)){
                System.out.println(st[i]);
            }
        }*/



// using Stream Api
        ArrayList<String> le = new ArrayList<>();
        le.add("shubham");
        le.add("sss");
        le.add("lkkkkl");
        le.add("dhhh");

        Stream <String > s= le.stream();
        s.map(e-> e.charAt(0)).forEach(e-> System.out.println(e));

    }
}
