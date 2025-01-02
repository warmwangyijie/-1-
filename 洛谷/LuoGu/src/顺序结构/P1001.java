package 顺序结构;

import java.util.Scanner;

public class P1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = AddFunction(a, b);
        System.out.println(result);

    }

    public static int AddFunction(int a, int b) {

        return a + b;

    }
}
