package Revision;
// Fisrt and Last String find kiya hai
public class Substring {
    public static void main(String[] args) {


        String  str = "shubham";

        char c= str.charAt(0);
        char s = str.charAt(str.length()-1);

        str= String.valueOf(c)+ String.valueOf(s);

        System.out.println(str);
    }
}
