package String;
// String Objects are immutable iski object change nahi kar sakta Agr change karne ki koshish karenge to ek ar object create kar dega
public class ImmutableString {
    public static void main(String[] args) {
        String str="shubham";
     //  str.concat("java"); // isme sirf shubham aayega
      str= str.concat("java"); // isme String Constent pool me ek aur object bajega aur or shubham java aayega
                                    // ye change karne ki koshish kiya hu
        System.out.println(str);
    }
}
