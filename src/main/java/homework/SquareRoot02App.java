package homework;

import java.util.Scanner;

public class SquareRoot02App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.6f", Math.sqrt(n));
    }
}
