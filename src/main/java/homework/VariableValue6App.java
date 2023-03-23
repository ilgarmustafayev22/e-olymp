package homework;

import java.util.Scanner;

public class VariableValue6App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = ((Math.sqrt((x * x * x * x) + 1)) / (x * x)) - (Math.sqrt((x * x) / ((x * x) + 1)));
        System.out.printf("%.3f", y);
    }
}
