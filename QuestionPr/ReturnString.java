package QuestionPr;
// wap to retun non repting number aabbcceff  e ko return karna hai agar non repting nahi hai to null return karna hai
public class ReturnString {
    public static Character reTStr(String str){

        for (int i = 0 ;i<str.length();i++)
        {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c) )
            {
                return c;
            }
        }
        return null;
    }
    public static void main(String[] args) {


        Character ssbbhhfuu = reTStr("ssbbhhfuu");
        System.out.println(ssbbhhfuu);
    }
}
