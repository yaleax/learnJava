package com.suan.flow;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建一个Scanner对象，用于读取标准输入（键盘输入）
        System.out.println("请输入名字"); // 提示用户输入
        String str = scanner.nextLine(); // 读取输入中的下一行
        System.out.println("Your input is: " + str); // 输出用户的输入
        scanner.close(); // 关闭Scanner对象

    }
}
