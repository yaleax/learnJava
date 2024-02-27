package com.suan.array;

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        System.out.println("原始二维数组：");
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

//        System.out.println(value);
        System.out.println("压缩二维数组：");
        int [][] sparseArray = new int[value+1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = value;

        int count = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] != 0){
                    count ++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = arrays[i][j];
                }
            }
        }
        for (int[] ints : sparseArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");

            }
            System.out.println(" ");

        }
        System.out.println("还原的二维数组：");
        int [][] restoreArray = new int [sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {
            restoreArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        for (int[] ints : restoreArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println(" ");
        }

    }
}
