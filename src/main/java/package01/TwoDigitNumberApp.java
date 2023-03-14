package package01;

import java.util.Scanner;

public class TwoDigitNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n >= 10 && n < 100) {
            System.out.println("Ok");

        } else if (n <= -10 && n > -100) {
            System.out.println("Ok");

        } else {
            System.out.println("No");
        }
    }
}