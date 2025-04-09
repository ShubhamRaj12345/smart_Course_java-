package NumberPattern;

public class Alphabet1 {
    public static void main(String[] args) {

        int count = 65; // A ki aski value hai ye
        for (int i = 1; i<=4;i++)
        {
            for (int j = 1; j<=i;j++)
            {
                System.out.print((char)count+" ");
                count = count+1;

            }
            System.out.println();
        }
    }
}

/*
A
B C
D E F
G H I J
*/
