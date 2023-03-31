package homework;

import java.util.Scanner;

public class TaskDApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            if (max < curr) {
                max = curr;
                count++;
            }
        }
        System.out.println(max + " " + count);
    }
}
