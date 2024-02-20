package com.suan.sequences;

public class ForDemo02 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2!=0){
                oddSum = oddSum + i;
            } else {
                evenSum = evenSum + i;
            }
        }
        System.out.println("even's sum is: " + evenSum);
        System.out.println("odd's sum is: " + oddSum);
    }
}
