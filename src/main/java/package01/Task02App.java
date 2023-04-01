package package01;

import java.util.Scanner;

public class Task02App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 1; i--) {
            int hold = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = hold;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
