package homework;

import java.util.Scanner;

public class Array04App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double size = scan.nextDouble();
        double[] nums = new double[(int) size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextDouble();
        }
        boolean check = false;
        double sum = 0;
        double count = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0) {
                count++;
                sum += nums[i];
                check = true;
            }
        }
        if (check) {
            double aver = sum / count;
            System.out.printf("%.2f", aver);
        } else {
            System.out.println("Not Found");
        }
    }
}
