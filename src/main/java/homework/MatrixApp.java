package homework;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a++;
                System.out.print(a + 1 + " ");
            }
            System.out.println();
        }
    }
}
