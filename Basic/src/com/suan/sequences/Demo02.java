package com.suan.sequences;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("Please input a string: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.equals("Hello")) {
            System.out.println(s);
        }
        System.out.println("Hello, world1!");


        scanner.close();
    }
}
