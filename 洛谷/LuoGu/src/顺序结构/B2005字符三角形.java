package 顺序结构;

import java.util.Scanner;

public class B2005字符三角形 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 这里要获取输入的单个字符，使用next()方法获取字符串，再取第一个字符
        char ch = scanner.next().charAt(0);
        createTriangle(ch);
    }

    public static void createTriangle(char ch) {
        System.out.println("  " + ch);
        System.out.println(" " + ch + ch + ch);
        System.out.println("" + ch + ch + ch + ch + ch);
    }
}