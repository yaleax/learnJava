package com.oop.Demo05;

public class Num32 {
    public static void print(int num){
        for (int i = 31; i >= 0; i--) {
            String bit = ((num & (1 << i)) == 0) ? "0":"1";
            System.out.print(bit);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = -5;
        print(num);

        int a = Integer.MAX_VALUE;
        System.out.println(a);
        int b = 100;
        int c = 200;
        System.out.println("========");
        print(b);
        print(c);
        System.out.println("========");
        print(b & c);
        print(b | c);
        print(b ^ c);

    }
}
