package com.oop.Demo05;

public class Num32 {
    public static void print(int num){
        for (int i = 31; i >= 0; i--) {
            String bit = ((num & (1 << i)) == 0) ? "0":"1";
            System.out.print(bit);
        }
    }

    public static void main(String[] args) {
        int num = 8;
        print(num);
    }
}
