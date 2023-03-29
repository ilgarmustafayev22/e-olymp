package homework;

import java.util.Scanner;

public class SnakeMatrixApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currRow = 1;
        int[][] num = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                num[row][col] = currRow++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(num[i][j] + " ");
                }
            } else {
                for (int j = num[0].length - 1; j >= 0; j--) {
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
