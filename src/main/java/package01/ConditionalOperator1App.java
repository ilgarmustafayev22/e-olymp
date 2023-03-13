package package01;

import java.util.Scanner;

public class ConditionalOperator1App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x < 5) {
            System.out.println((x * x) - (3 * x) + 4);
        } else if (x >= 5) {
            System.out.println(x + 7);

        }
    }
}
