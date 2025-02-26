package array2D;

public class new2d {
    public static void main(String[] args) {
        //  int A[][]= new int[3][3];
        int B[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {

                System.out.print(B[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
