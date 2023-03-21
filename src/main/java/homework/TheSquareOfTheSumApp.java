package homework;

import java.util.Scanner;

public class TheSquareOfTheSumApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem = num % 10;
        int a = num / 10;
        int sum = rem + a;
        System.out.println(sum * sum);
    }
}
