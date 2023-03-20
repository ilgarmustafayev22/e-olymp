package homework;

import java.util.Scanner;

public class Array06App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] nums = new double[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextDouble();
        }
        double sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] < 0) {
                count++;
                sum += nums[i];
            }
        }
        System.out.printf(count + " " + "%.2f", sum);
    }
}
