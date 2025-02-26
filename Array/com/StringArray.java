package Array.com;

public class StringArray {
    public static void main(String[] args) {

        String  str[] = {"shubham ","sonu","raj"};
        for (String i : str)
        {
            System.out.println(i+" ");
        }
        //print througth for loop
        System.out.println("_____________________________________________________________________________________");
        for (int i = 0;i< str.length;i++)
        {
            System.out.println(str[i]);
        }
        System.out.println("_______________________________________");
        // iterate in backward direction
        for (int j = str.length-1;j>=0;j--)
        {
            System.out.println(str[j]);
        }
    }
}
