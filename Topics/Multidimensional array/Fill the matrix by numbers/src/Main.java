import java.util.Scanner;

import static java.lang.Math.abs;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = abs(j - i);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}