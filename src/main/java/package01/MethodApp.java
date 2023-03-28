package package01;

import java.util.Scanner;

public class MethodApp {
    public static void main(String[] args) {
        printDigit();
    }

    public static void printDigit() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            System.out.print(rem + " ");
        }
    }
}


