package com.suan.array;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        int[] names = new int[10];
        names[0] = 1;
        names[1] = 2;
        names[2] = 3;
        names[3] = 4;
        names[4] = 5;
        names[5] = 6;
        names[6] = 7;
        names[7] = 8;
        names[8] = 9;
        names[9] = 10;
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            sum += names[i];
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
