package homework;

import java.util.Scanner;

public class Function03App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            System.out.printf("%.4f\n", (x * x) + Math.sin(x * y) - (y * y));
        }
    }
}
