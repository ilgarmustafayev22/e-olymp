package package01;

import java.util.Scanner;

public class Task03App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int max2 = -105;
        int a=0;
        for (int i = 1; i < size; i++) {
            if (max < nums[i]) {
                max = nums[i];
                a=i;
            }
        }
        for (int i = 0; i < size; i++) {
            if (i!=a && max2<nums[i] ) {
                max2 = nums[i];
            }
        }
        System.out.println(max + max2);
    }
}
