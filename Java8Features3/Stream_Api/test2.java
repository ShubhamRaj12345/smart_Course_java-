package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// wap to print all all the string value whose length is greater than 5
public class test2 {
    public static void main(String[] args) {

        String at[]={"shubham","sonu","sd"};
        for (int i = 0; i<at.length;i++)
        {
            if (at[i].length()> 5)
            {
                System.out.println(at[i]);
            }
        }
        System.out.println("method stream api +++++++++++++++++++++++++++++++++++++++");
// print throught java 8 features stream api

        ArrayList<String> le = new ArrayList<>();
        le.add("shubham");
        le.add("sss");
        le.add("lkkkkl");
        le.add("ghhh");

        le.stream().filter(we-> we.length()> 5).forEach(we -> System.out.println(we));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        // ye maine list ke andar store kar liya aur list ka koi bhi operation perform kar sakte hai
        List<String> collect = le.stream().filter(rt -> rt.length() > 5).collect(Collectors.toList());
        System.out.println(collect);
    }
}
