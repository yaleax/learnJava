package com.suan.sequences;

import java.util.Scanner;

public class Demo04 {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入成绩0-100整数（输入-1退出程序）:");
                while (!scanner.hasNextInt()) {
                    System.out.println("输入不合法，请输入一个0-100整数:");
                    scanner.next(); // 读取并丢弃非整数输入
                }
                int score = scanner.nextInt();
                while ((score < 0 && score != -1) || score > 100){
                    System.out.println("输入不合法，请重新输入:");
                    score = scanner.nextInt();
                }
                if (score == -1) { // 提供退出机制
                    System.out.println("程序退出");
                    break; // 退出循环
                }
                if (score == 100){
                    System.out.println("S");
                } else if (score >= 90){
                    System.out.println("A");
                } else if (score >= 80){
                    System.out.println("B");
                } else if (score >= 70){
                    System.out.println("C");
                } else if (score >= 60) {
                    System.out.println("D");
                } else { // 此处已经保证了score >= 0，无需重复判断
                    System.out.println("F"); // 修改为"F"等级
                }
            }
            scanner.close(); // 在循环结束后关闭scanner
        }
    }

