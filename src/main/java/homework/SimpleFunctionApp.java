package homework;

import java.util.Scanner;

public class SimpleFunctionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.printf("%.4f", x + Math.sin(x));
    }
}
