package com.suan.flow;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //
        System.out.println("请输入若干个数，每输入一个数用回车确认，最后输入非数字结束。");
        Scanner scanner = new Scanner(System.in); // 创建一个Scanner对象，用于读取标准输入（键盘输入）

        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble())
        {
            double x = scanner.nextDouble();
            m = m + 1;

            sum = sum + x;
            System.out.println("您输入了第" + m + "个数，当前和为" + sum);
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值为" + (sum / m));

        scanner.close();
    }
}
