package String;
// String contain method ye check karega ki ye is String me present hai ya nahi
public class StringContaint {
    public static void main(String[] args) {

        String str ="priyanshu";

        System.out.println(str.contains("shsu"));
        System.out.println(str.charAt(6));// ye character value ko get karane ke liye hai
        System.out.println(str.startsWith("pri"));// true
        System.out.println(str.endsWith("shu"));

        // ye  maine  integer ko String me convert kar diya hai
        int i = 12012;
        System.out.println(String.valueOf(i).length());

    }
}
