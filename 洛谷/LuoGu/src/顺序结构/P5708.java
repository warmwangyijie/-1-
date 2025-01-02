package 顺序结构;

import java.util.Scanner;

public class P5708 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double p = 0.5 * (a + b + c);

        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("%.1f", result);


    }
}
