package 顺序结构;

import java.util.Scanner;

public class P5706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble(); // 获取肥宅快乐水的总量（毫升）
        int n = scanner.nextInt(); // 获取同学的人数

        // 计算每名同学可获得的饮料毫升数，精确到小数点后3位
        double amountPerStudent = t / n;
        // 计算总共需要的杯子数
        int totalCups = n * 2;

        System.out.printf("%.3f\n", amountPerStudent);
        System.out.println(totalCups);

        scanner.close(); // 关闭Scanner对象，释放资源
    }
}