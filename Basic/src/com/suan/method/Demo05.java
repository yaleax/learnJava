package com.suan.method;

public class Demo05 {
    public static void main(String[] args) {
        printMax(1,2,3,4,5,6,7,8,9,10);

    }
    public static void printMax(double...numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is:" + result);
    }
}
