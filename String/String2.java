package String;

public class String2 {
    public static void main(String[] args) {

        String str = "shubham";
       int len =  str.length();// yeinteger me value return karta hai
        System.out.println(len);
        System.out.println(str.length()); // same as previous
       boolean st =  str.isEmpty(); // boolean me value retrn  karega
        System.out.println(st);

       String strr=  str.trim();// ye spaces ko remove kar dega  aage ya piche wala bich wela nahi
        System.out.println(strr);
    }
}
