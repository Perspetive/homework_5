import java.util.Scanner;

class Array{
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] array = new int[n][m];

        int max = n * m;
        int num = 1;

        int str_min = 0;
        int str_max = n - 1;

        int stb_min = 0;
        int stb_max = m - 1;
        //Проход в разные стороны вврх/вниз/вправо/налево.
        while (num <= max){
            for (int i = stb_min; num <= max && i <=stb_max; i++) {
                array[str_min][i] = num++;
            }
            str_min++;
            for (int i = str_min; num <= max && i <= str_max; i++) {
                array[i][stb_max] = num++;
            }
            stb_max--;
            for (int i = stb_max; num <= max && i >= stb_min; i--) {
                array[str_max][i] = num++;
            }
            str_max--;
            for (int i = str_max; num <= max && i >= str_min; i--) {
                array[i][stb_min] = num++;
            }
            stb_min++;
        }
        Array.printArray(array);
    }
}
