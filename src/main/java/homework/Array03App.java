package homework;

import java.util.Scanner;

public class Array03App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int sum = 0;
        int curr = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0 && nums[i] % 6 == 0) {
                curr++;
                sum = sum + nums[i];
            }
        }
        System.out.print(curr + " ");
        System.out.print(sum);
    }
}
