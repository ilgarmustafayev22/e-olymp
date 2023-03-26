package homework;

import java.util.Scanner;

public class Task04App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k =scan.nextInt();
        int n = scan.nextInt();
        System.out.printf("%.0f",(Math.pow(2, k) + Math.pow(2, n)));
    }
}