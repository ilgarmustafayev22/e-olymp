package homework;

import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            sum += rem;
        }
        System.out.printf("%.3f", Math.sqrt(sum));
    }
}
