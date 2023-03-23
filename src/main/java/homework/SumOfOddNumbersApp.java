package homework;

import java.util.Scanner;

public class SumOfOddNumbersApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sum = 0;
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
            if (nums[i] % 2 == 1) {
                sum += nums[i];
            }
            System.out.println(sum);
        }
    }
}
