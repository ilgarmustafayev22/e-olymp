package homework;

import java.util.Scanner;

public class Task01App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        double prod = 1;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
            prod *= rem;
        }
        System.out.printf("%.3f", prod / sum);
    }
}
