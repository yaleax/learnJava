package com.suan.method;

public class Demo06 {
    public static void main(String[] args) {
        int factorial = f(5);
        System.out.println(factorial);
    }
    public static int f(int n){
        if (n == 1){
            return 1;
        }else {
            return n * f(n-1);
        }
    }
}


