package com.suan.sequences;

public class Dowhile01 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0){
            i++;
            System.out.println(i);
        }
        System.out.println("==============");
        do {
            System.out.println(i);
        } while (i < 0);
    }
}
