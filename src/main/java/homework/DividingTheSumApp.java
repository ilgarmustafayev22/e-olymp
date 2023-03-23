package homework;

import java.util.Scanner;

public class DividingTheSumApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long n = 1;
        for (int i = 2; i < k; i++) {
            n += i;
            if (n % k == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
