package com.suan.array;


import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,2,5};
        printArray(arr);
        Arrays.sort(arr);
        System.out.println("排序后的数组：");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print("[");
            }
            if (i == arr.length-1){
                System.out.println(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
