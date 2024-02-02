package com.suan.flow;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建一个Scanner对象，用于读取标准输入（键盘输入）

        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数："); // 提示用户输入

        if (scanner.hasNextInt()){
            i = scanner.nextInt(); // 读取输入中的下一个整数
            System.out.println("Your input is: " + i); // 输出用户的输入
        }else {
            System.out.println("输入的不是整数！");
        }

        System.out.println("请输入小数："); // 提示用户输入
        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat(); // 读取输入中的下一个小数
            System.out.println("Your input is: " + f); // 输出用户的输入
        }else {
            System.out.println("输入的不是小数！");
        }
        scanner.close(); // 关闭Scanner对象
    }
}
