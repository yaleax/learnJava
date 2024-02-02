package com.suan.flow;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("Your input is: " + str);
        }
        scanner.close();
    }
}
