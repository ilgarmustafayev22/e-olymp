package homework;

import java.util.Scanner;

public class FunctionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double maxXY = Math.max(x, y);
        double maxYZ = Math.max(y, z);
        double sum = x + y + z;
        double min = Math.min(maxXY, maxYZ);
        System.out.printf("%.2f", Math.min(sum, min));
    }
}
