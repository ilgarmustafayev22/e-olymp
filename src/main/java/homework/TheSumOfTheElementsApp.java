package homework;

import java.util.Scanner;

public class TheSumOfTheElementsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] nums=new double[size];
        for (int i=0;i<size;i++){
            nums[i]=scan.nextDouble();
        }double sum =0;
        for (int i = 0;i<size;i++){
            sum+=nums[i];
        }
        System.out.printf("%.1f",sum);
    }
}
