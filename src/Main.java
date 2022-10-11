import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        int i = 0, j = 0;
        for (int k = 0; k < n * m; ++k, ++j) {
            if (k != 0 && k % m == 0) {
                i++;
                j = 0;
                System.out.println();
            }

            a[i][j] = i * j;
            System.out.print(a[i][j] + "\t");
        }
    }
}
