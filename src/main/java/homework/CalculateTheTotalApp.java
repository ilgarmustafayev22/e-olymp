package homework;

import java.util.Scanner;

public class CalculateTheTotalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            double a = (1 / (i * (i + 1)));
            sum += a;
        }
        System.out.printf("%.6f", sum);
    }
}
