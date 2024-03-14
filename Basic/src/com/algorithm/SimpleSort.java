package com.algorithm;

public class SimpleSort {

    public static void selectSort(int[] arr){
        if (arr == null || arr.length <2){
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minValuaIndex = i;
            for (int j = i + 1; j < n; j++) {
                minValuaIndex = arr[minValuaIndex] > arr[j]? j:minValuaIndex;

            }
            Tool.swap(arr,minValuaIndex,i);
        }
    }

    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length <2){
            return;
        }
        int n = arr.length;
        for (int  end = n-1;  end >= 0;  end--) {
            for (int second = 1; second <= end ; second++) {
                if (arr[second -1] >arr[second]){
                    Tool.swap(arr,second-1,second);
                }
            }
        }
    }

    public static void insertSort(int[] arr){
        if (arr == null || arr.length <2){
            return;
        }
        int n = arr.length;
        for (int end = 1; end < n ; end++) {
            int newNumIndex = end;
            while (newNumIndex -1 >=0 && arr[newNumIndex - 1] > arr[newNumIndex]){
                Tool.swap(arr,newNumIndex-1,newNumIndex);
                newNumIndex --;

            }

        }

    }
    public static void insertSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int n = arr.length;
        for (int end = 1; end < n; end++) {
            for (int pre = end -1; pre >= 0 && arr[pre] > arr[pre + 1] ; pre--) {
                Tool.swap(arr,pre,pre +1);
                
            }

        }

    }

}
