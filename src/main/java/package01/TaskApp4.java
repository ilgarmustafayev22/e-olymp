package package01;

import java.util.Scanner;

public class TaskApp4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 == 1 || (n >= 100 && n < 1000) || n % 2 == -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
