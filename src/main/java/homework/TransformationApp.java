package homework;

import java.util.Scanner;

public class TransformationApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        while (num != 1) {
            count++;
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num += 1;
            }
        }
        System.out.println(count);
    }
}
