package homework;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = (int) (Math.random() * 101);
        System.out.println(" Let the game begin!.");
        while (in.hasNext()) {
            int num = in.nextInt();
            if (a > num) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (a < num) {
                System.out.println("Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations,");
                break;
            }
        }
    }
}
