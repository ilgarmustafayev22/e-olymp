package package01;

import java.util.Scanner;

public class InsideTheIntervalApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a <= x && x <= b) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}
