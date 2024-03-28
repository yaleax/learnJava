package com.zuo;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int [] arry = new int[]{4,9,5,6,7,8,2,3};

        //selectSort(arry);
        //bubbleSort(arry);
        insertionSort(arry);
        System.out.println(Arrays.toString(arry));
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[minIndex] > arr[j]){

                    minIndex = j;
                }

            }
            swap(arr,i,minIndex);
        }

    }
    public static void bubbleSort(int[] arr){
        for (int i = 0;i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j +1]){
                    swap(arr,j,j+1);
                }
            }

        }

    }
    public static void insertionSort (int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr,j,j + 1);
                
            }

        }

    }
}
