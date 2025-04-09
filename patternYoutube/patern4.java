package patternYoutube;

public class patern4 {
    public static void main(String[] args) {

        for (int i =1;i<=4;i++)//1
        {
            for (int j = 2;j<=i;j++)//3
            {
                System.out.print(" ");
            }
            for (int k =4;k>=i;k--)//2
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
