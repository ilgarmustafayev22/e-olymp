package homework;

import java.util.Scanner;

public class DepositMoneyApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long s = scan.nextLong();

        long t = 1;
        long n = 0;
        while (t <= s) {
            n += 1;
            t *= 2;
            t += n;
        }
        System.out.println(n);
    }
}
