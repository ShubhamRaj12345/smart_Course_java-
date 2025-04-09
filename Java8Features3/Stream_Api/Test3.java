package Java8Features3.Stream_Api;

import java.util.ArrayList;
import java.util.stream.Stream;

// wap to print the name whose name starts with d
public class Test3 {
    public static void main(String[] args) {

      String str[] ={"shubham","deepak","sonu","deepesh"};
      int a = str.length;
      for (int i = 0;i<a;i++)
      {
          if (str[i].startsWith("d") && str[i].endsWith("h"))
              System.out.println(str[i]);
      }



      // print through stream api
// wap to print the name whose name starts with d
        System.out.println("_______________________________________________________");
        ArrayList<String> le = new ArrayList<>();
        le.add("shubham");
        le.add("sss");
        le.add("lkkkkl");
        le.add("dhhh");
                 //yaha string provide kiye tab String ke sare method aaye hai // by default sirf s ye object tha //
                 // aur type caste nahi karna pda
        Stream <String >s = le.stream();
        s.filter(e-> e.startsWith("d")).forEach(e-> System.out.println(e));

    }



}
