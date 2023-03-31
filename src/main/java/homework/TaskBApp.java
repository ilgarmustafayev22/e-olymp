package homework;

import java.util.Scanner;

public class TaskBApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n-1; i++) {
            int firstElem = nums[i-1] ;
            int secondElem = nums[i];
            int thirdElem = nums[i+1];
            if (firstElem < secondElem && thirdElem < secondElem) {
                count++;

            }
        } System.out.print(count);
    }
}
