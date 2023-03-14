package package01;

import java.util.Scanner;

public class ConditionalStatement3App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x < -4) {
            System.out.println(x + 5);
        } else if (-4 <= x && x <= 7) {
            System.out.println((x * x) - 3 * x);

        } else if (x > 7) {
            System.out.println((x * x * x) + 2 * x);

        }
    }
}
