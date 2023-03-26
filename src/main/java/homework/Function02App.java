package homework;

import java.util.Scanner;

public class Function02App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double x = in.nextDouble();
            System.out.printf("%.4f\n", Math.sqrt(x) + (2 * x) + Math.sin(x));
        }
    }
}
