package com.suan.array;

import java.util.Arrays;

public class Demo07 {
    public static void main(String[] args) {
        int [][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[1][3] = 2;
        System.out.println("原始的二维数组：");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("稀疏数组：");
        int cout = 0;
        for (int[] ints : arr) {
            for (int ints1 : ints) {
                if (ints1 != 0){
                    cout++;
                }


            }

        }

        int[][] sparseArr = new int[cout+1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = cout;
        
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = arr[i][j];
                }
            }
        }
        for (int[] ints : sparseArr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("还原的二维数组：");
        int[][] arr2 = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            arr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println(" ");

            }

        }
    }
