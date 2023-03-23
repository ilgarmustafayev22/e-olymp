package homework;

import java.util.Scanner;

public class Function06App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = x - (((x * x) + 4) / 2) + (x * x * x) - ((3) / (x + 7));
        System.out.printf("%.3f", y);
    }
}
