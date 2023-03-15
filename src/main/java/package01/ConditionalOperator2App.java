package package01;

import java.util.Scanner;

public class ConditionalOperator2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        if (x >= 10) System.out.println((x * x * x) + (5 * x));
        else if (x < 10) {
            System.out.println((x * x) - (2 * x) + 4);
        }
    }
}
