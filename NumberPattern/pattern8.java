package NumberPattern;

public class pattern8 {
    public static void main(String[] args) {

        int count =1,  e= 0;
        for (int i=1;i<=4;i++)
        {
            if(i %2 ==0)
            {
                e = e+3;
                for (int j = 1; j<=4;j++)
                {
                    System.out.print(e+" ");
                    e= e-1;
                    count= count+1;
                }
            }else {
                for (int j = 1; j<=4; j++)
                {
                    System.out.print(count+" ");
                    count = count +1;
                }
                e= count;
            }
            System.out.println();
        }
    }
}
/*

        1 2 3 4
        8 7 6 5
        9 10 11 12
        16 15 14 13 */
