package com.suan.sequences;

public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i+"\t");
            }
            if (i % 15 == 0) {
                System.out.println();
            }

        }
    }
}
