package com.suan.array;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("===========");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum is:" + sum);
        System.out.println("===========");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max is:" + max);
        System.out.println("===========");
        for (int i : arr) {
            System.out.println(i);

        }
        System.out.println("===========");
        int[] reverse = reverse(arr);
        System.out.println("reverse is:" + reverse);

    }

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0, j = result.length - 1; i < arr.length; i++, j--) {
            result[j] = arr[i];
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }
}

