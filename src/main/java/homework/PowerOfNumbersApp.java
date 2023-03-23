package homework;

import java.util.Scanner;

public class PowerOfNumbersApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double n = sc.nextDouble();
        System.out.printf("%.0f", Math.pow(a, n));
    }
}
