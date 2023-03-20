package homework;

import java.util.Scanner;

public class ArrayApp05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] nums = new double[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextDouble();
        }
        double max = Math.abs(nums[0]);
        for (int i = 1; i < size; i++) {
            double curr = nums[i];
            if(nums[i]<0){
                curr  *= (-1);

            }
            if (max < curr) {
                max = curr;
            }
        }
        System.out.printf("%.2f", max);
    }
}
