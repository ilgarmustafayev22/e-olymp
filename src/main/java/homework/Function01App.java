package homework;

import java.util.Scanner;

public class Function01App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            System.out.printf("%.4f\n", (x * x * x) + (2 * x * x) - 3);
        }
    }
}
