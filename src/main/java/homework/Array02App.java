package homework;

import java.util.Scanner;

public class Array02App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double size = scan.nextDouble();
        double[] nums = new double[(int) size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextDouble();
        }
        boolean test = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 2.5) {
                System.out.printf(i + 1 + " " + "%.2f", nums[i]);
                test = true;
                break;
            }
        }
        if (!test) {
            System.out.println("Not Found");
        }
    }
}
