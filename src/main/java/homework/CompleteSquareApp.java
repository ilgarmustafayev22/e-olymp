package homework;

import java.util.Scanner;

public class CompleteSquareApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = false;
        for (int i = 0; i <= Math.sqrt(n); i++) {
            if (Math.sqrt(n) == i) {
                System.out.println(i);
                a = true;
            }
        }
        if (a != true) {
            System.out.println("No");
        }
    }
}
