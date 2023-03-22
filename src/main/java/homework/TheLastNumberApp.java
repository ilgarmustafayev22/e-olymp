package homework;

import java.util.Scanner;

public class TheLastNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        while (n > 0) {
            int rem = (int) (n % 10);
            System.out.println(rem);
            break;
        }
    }
}
