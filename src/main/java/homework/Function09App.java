package homework;

import java.util.Scanner;

public class Function09App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = ((2 * x) / (Math.sqrt((x * x) + 1))) - ((Math.sqrt((x * x) + 1) / (x * x * x)));
        System.out.printf("%.3f", y);
    }
}
