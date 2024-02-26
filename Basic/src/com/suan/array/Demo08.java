package com.suan.array;

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        int[][] arrays = new int[11][11];
        arrays[1][2] = 1;
        arrays[2][3] = 2;
        arrays[2][4] = 1;

        for (int[] array : arrays) {
            for (int arr : array) {
                System.out.print(arr + "\t");
            }
            System.out.println(" ");
        }

        int value= 0;
        for (int[] array : arrays) {
            for (int i : array) {
                if (i != 0){
                    value ++;
                }
            }
        }

        System.out.println(value);

        int [][] spareArray = new int[value+1][3];
        spareArray[0][0] = 11;
        spareArray[0][1] = 11;
        spareArray[0][2] = value;

        int count = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] != 0){
                    count ++;
                    spareArray[count][0] = i;
                    spareArray[count][1] = j;
                    spareArray[count][2] = arrays[i][j];
                }
            }
        }
        for (int[] ints : spareArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println(" ");

        }
        System.out.println("还原的二维数组：");

    }
}
