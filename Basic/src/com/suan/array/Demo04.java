package com.suan.array;

import java.io.PrintStream;

public class Demo04 {
    public static void main(String[] args) {
        int[] [] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        Demo03.printArray(array[3]);
        System.out.println(" ");
        System.out.println(array[0].length);
        for (int i = 0; i < array.length; i++) {
            Demo03.printArray(array[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println(Demo03.reverse(array[i]));
        }
    }
}
