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
        int count = 0;
        for (int[] array : arrays) {
            for (int i : array) {
                if (i >0){
                    count ++;
                }
            }
        }
        System.out.println(count);
        int [][] spareArray = new int[count+1][3];
        spareArray[0][0] = 11;
        spareArray[0][1] = 11;
        spareArray[0][2] = count;

        for (int i = 0; i < spareArray.length; i++) {
            for (int j = 0; j < spareArray[i].length; j++) {

            }

        }

        }

        for (int[] ints : spareArray) {
            for (int anInt : ints) {
                System.out.println(anInt);

            }

        }

    }
}
