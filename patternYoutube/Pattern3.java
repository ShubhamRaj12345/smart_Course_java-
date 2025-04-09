package patternYoutube;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i =1;i<=4;i++)  //1
        {
            for (int j = 3;j>=i;j--)
            {
              System.out.print("  ");
            }
            for (int k = 1;k<=i;k++)  //2
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
