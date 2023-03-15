package package01;

import java.util.Scanner;

public class DivisibilityDigitsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int a = num % 10;
        int b = num / 10;
        int c = b % 10;
        int d = b / 10;
        int e = d % 10;
        int f = d / 10;
        if (a == 0 || c == 0 || e == 0) {
            System.out.println("NO");
        } else if (num % a == 0 && num % c == 0 && num % e == 0 && num % f == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
