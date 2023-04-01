package package01;

import java.util.Scanner;

public class Task04App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] nums = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                nums[i][j] = sc.nextInt();
            }
        }int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
