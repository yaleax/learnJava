package com.zuo;

public class Demo03 {

    public static void print(int n){

        for (int i = 31; i >= 0; i--) {
            boolean bitIsSet = (n & (1 << i)) !=0;
            System.out.print(bitIsSet ? "1":"0");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        print(Integer.MIN_VALUE);
    }
}
