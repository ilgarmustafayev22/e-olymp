package package01;

import java.util.Scanner;

public class Task06App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(foo(n));
    }

    public static boolean foo(int a) {
        int hold = a;
        int ters = 0;
        while (a > 0) {
            int rem = a % 10;
            a /= 10;
            ters = 10 * ters + rem;
        }
        if (hold == ters) {
            return true;
        }
        return false;
    }
}