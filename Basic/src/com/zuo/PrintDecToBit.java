package com.zuo;

import java.util.Scanner;

public class PrintDecToBit {

    public static void printDecToBit(int n){

        for (int i = 31; i >= 0; i--) {
            System.out.print((n & (1 << i)) ==0 ? "0":"1");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        printDecToBit(0x4e);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个整数：");
            String input = scanner.nextLine();


            if ("c".equals(input)){
                System.out.println("退出程序！");
                break;
            }
            try {
                int n = Integer.parseInt(input);
                printDecToBit(n);
            }catch (NumberFormatException e){
                System.out.println("请输入一个有效的整数！");
            }
        }
    }
}
