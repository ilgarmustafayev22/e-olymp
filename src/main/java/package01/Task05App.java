package package01;

import java.util.Scanner;

public class Task05App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (n == 1 || n == 0) {
            System.out.println("Ooops!");
        } else {
            int max = nums[0];
            int min = nums[0];
            for (int i = 1; i < n; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
            System.out.println(min + " " + max);
        }
    }
}
