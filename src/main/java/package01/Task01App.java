package package01;

import java.util.Scanner;

public class Task01App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
    }
}
