package com.suan.array;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int arr[] = {1,4,3,6,2,5};
        int[] sort = sorts(arr);
        System.out.println(Arrays.toString(sort));
    }
    public static int[] sorts(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
//            System.out.print(arr[i]+ "|");
            for (int j = 0; j < arr.length-1-i; j++) {
//                System.out.print(arr[j]+ ",");
                if (arr[j] > arr [j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }


            }
//            System.out.println(" ");

        }
        return arr;
    }
}
