package com.suan.sequences;

public class ForDemo05 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : number) {
            System.out.println(i);

        }
        System.out.println("-------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
        for (int i : number) {
            for(int j : number) {
                System.out.print(i + " * " +j +" = "+ i*j + "\t");
            }
            System.out.println();
        }
    }
}
