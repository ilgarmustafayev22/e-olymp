package homework;

import java.util.Scanner;

public class RectangularApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
