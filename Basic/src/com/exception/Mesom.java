package com.exception;

public class Mesom {

    public static int print(int num){
        int n = 0;
        int c = 1;
        for (int i = 1; i <= num; i++) {
            c = c*i;
            n += c;
        }
        return c;


    }


    public static void main(String[] args) {
        int resul = print(5);
        System.out.println(resul);
    }
}
