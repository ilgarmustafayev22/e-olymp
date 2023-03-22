package homework;

import java.util.Scanner;

public class SumOfSquares02App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            long squar =  i * i;
            sum += squar;
        }
        System.out.println(sum);
    }
}
