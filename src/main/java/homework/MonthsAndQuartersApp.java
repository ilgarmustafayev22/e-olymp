package homework;

import java.util.Scanner;

public class MonthsAndQuartersApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        if (month >= 1 && month <= 3) {
            System.out.println("First");
        } else if (month >= 4 && month <= 6) {
            System.out.println("Second");
        } else if (month >= 7 && month <= 9) {
            System.out.println("Third");
        } else {
            System.out.println("Fourth");
        }
    }
}
