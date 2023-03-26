package homework;

import java.util.Scanner;

public class PowerOfTwoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = false;
        for (int i = 0; i < 32; i++) {
            if (Math.pow(2, i) == n) {
                System.out.println("YES");
                a = true;
                break;
            }
        }
        if (a != true) {
            System.out.println("NO");
        }
    }
}
