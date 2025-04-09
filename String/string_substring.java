package String;

public class string_substring {
    public static void main(String[] args) {
        String str = "shubham";
        char ch = str.charAt(0);
        char h = str.charAt(str.length() - 3);

     String rh =    str.valueOf(ch)+ str.valueOf(h);
        System.out.println(rh);
    }
}
