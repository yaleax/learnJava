package com.algorithm;

public class App {
    public static void main(String[] args) {
        int arr[] = {9,4,5,7,2,5,7,2,9,5,8,7,2,1};
        int arr1[] = {9,4,5,7,2,5,7,2,9,5,8,7,2,1};
        int arr2[] = {9,4,5,7,2,5,7,2,9,5,8,7,2,1};
        int arr3[] = {9,4,5,7,2,5,7,2,9,5,8,7,2,1};

        System.out.println("原数组：");
        Tool.printArry(arr);
        System.out.println("selectSort后的原数组：");
        SimpleSort.selectSort(arr);
        Tool.printArry(arr);
        System.out.println("bubbleSort后的原数组：");
        SimpleSort.bubbleSort(arr1);
        Tool.printArry(arr1);
        System.out.println("insertSort后的原数组：");
        SimpleSort.insertSort(arr2);
        Tool.printArry(arr2);
        System.out.println("insertSort1后的原数组：");
        SimpleSort.insertSort1(arr3);
        Tool.printArry(arr3);
    }
}
