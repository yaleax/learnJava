package com.suan.sequences;

public class WhileDemo01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <=9){
            int j = 1;
            while (j <= i){
                System.out.print(j + " * " +i +" = "+ i*j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
