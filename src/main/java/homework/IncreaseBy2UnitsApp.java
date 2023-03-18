package homework;

import java.util.Scanner;

public class IncreaseBy2UnitsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                System.out.print(nums[i] + 2 + " ");
            } else {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
