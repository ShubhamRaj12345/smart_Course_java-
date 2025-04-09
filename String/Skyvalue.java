package String;

public class Skyvalue {
    public static void main(String[] args) {

        // yaha chararcter ki sky value nikale
//
//        char c ='a';// iski sky value 97 hai
//        char v ='A';  // 65       // ye dono ko subtract kar ke 32 aayah hai
//        System.out.println((int)c);
//
//        String st = "a";
//        String str ="A";
//        System.out.println(st.compareTo(str));
//    }

//        String st = "spring";
//        String str = "java";
//        System.out.println(st + str); // dono same hi hai
//        System.out.println(st.concat(str));   // ye dono ko add kara dega
//    }


        //______________________________________
        String str = "shubham";

        System.out.println(str.substring(3,5)); // only bh aayega

        String str1="shubham java";
        System.out.println(str1.replace("shubham","amit"));// for replace


        String st="shubham";
      char c=  st.charAt(0);
       char ch= st.charAt(st.length()-1);
        String sty= st.valueOf(c)+ st.valueOf(ch);
        System.out.println(sty);
    }


}
