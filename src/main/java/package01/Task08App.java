package package01;

import java.util.Scanner;

public class Task08App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        foo(a,b,c);
    }

    public static void foo(int a, int b, int c) {
        for (int i = 1; i <= b; i++) {
            System.out.println(Math.pow(i, c));
        }
    }
}
