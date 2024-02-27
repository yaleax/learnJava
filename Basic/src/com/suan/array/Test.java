package com.suan.array;

public class Test {
    public static void main(String[] args) {
        System.out.println("二维数组：");
        int [][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        arr[2][4] = 1;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("稀疏数组");
//        System.out.println(arr.length);
        int value = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != 0){
                    value ++;
                }
            }
        }
        int [][] sparseArray = new int[value+1][3];
        sparseArray [0][0] = arr.length;
        sparseArray [0][1] = arr.length;
        sparseArray [0][2] = value;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0){
                    count ++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = arr[i][j];
                }
            }
        }
        for (int[] ints : sparseArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("还原二维数组");
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
