package StarPattern;

public class Print_Z {
    public static void main(String[] args) {
        int n = 5;
        int temp = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == (n-i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}
