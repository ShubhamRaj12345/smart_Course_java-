package Array.com;

public class Array2 {

    int  rollno[];
    String  name [];

    Array2 [] tt;  // yaha mai Class ka bhi Array create kar sakta hu tt ye referance hai Array2 ka

    public static void main(String[] args) {

        int test [] = new int[3];

        test[0] = 20;
        test[1] = 40;
        test[2] = 30;
        for (int i = 0;i<test.length;i++)
        {
            System.out.println(test[i]);
        }

    }
}
