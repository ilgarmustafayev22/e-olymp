package package01;

import java.util.Scanner;

public class Task05App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");

        }
    }
}
