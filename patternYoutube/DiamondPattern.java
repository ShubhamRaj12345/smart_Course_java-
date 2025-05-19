package patternYoutube;

public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 1 ;i<=5;i++){ // rows
            for (int j = 5 ; j> i;j--){  // for space

                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // for lower

        for (int i = 4 ;i>=1;i--){ // rows
            for (int j = 5 ; j> i;j--){  // for space

                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
