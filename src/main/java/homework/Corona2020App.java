package homework;

import java.io.PrintStream;
import java.util.Scanner;

public class Corona2020App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int min = nums[0];
        int curr;
        for (int i = 1; i < size; i++) {
            curr = nums[i];
            if (max < curr) {
                max = curr;
            }
            if (min > curr) {
                min = curr;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] == min) {
                nums[i] = max;
            } else if (nums[i] == max) {
                nums[i] = min;
            }
            System.out.print(nums[i] + " ");
        }
    }
}
