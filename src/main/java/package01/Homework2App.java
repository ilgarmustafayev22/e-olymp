package package01;

import java.util.Scanner;

public class Homework2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 3 == 0 && n % 2 == 0 && n >= 10 && n < 100 || (n <= -10 && n > -100)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
