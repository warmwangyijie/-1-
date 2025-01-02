package 顺序结构;

import java.util.Scanner;

public class P5705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
