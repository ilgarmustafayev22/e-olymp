package package01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a % b != 0) {
            System.out.print(a / b);
            System.out.print(" ");
            System.out.println(a % b);

        } else {
            System.out.println("Divisible");
        }

    }
}
