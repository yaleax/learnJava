package com.exception;

import java.util.Scanner;

public class DecimalToBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要转化的十进值数字:");
        int decimal = scanner.nextInt();
        StringBuilder binary = new StringBuilder();
        if (decimal == 0){
            binary.append(0);
        }
        else {
            while (decimal > 0) {
                binary.insert(0,decimal % 2);
                decimal = decimal/2;

            }
        }

        int length = binary.length();
        System.out.println(binary);
        System.out.println(length+ "位");


    }
}
