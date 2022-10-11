import java.util.Scanner;

class Array{
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
    }

    public static void Snake_position(int n) {
        int[][] array = new int[n][n];

        int a = -1;
        int count = 1;
        for (int i = 0; i < n; i++) {
            a *= -1;
            int start = 0;
            if (i % 2 != 0) start = n - 1;
            else start = 0;
            for (int j = start; (j < n) & (j >= 0); j += a) {

                array[i][j] = count++;
            }
        }
        printArray(array);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_size = in.nextInt();
        Array.Snake_position(array_size);
    }
}
