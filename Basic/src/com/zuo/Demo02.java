package com.zuo;

import com.oop.Demo05.A;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int n = 100;
        int t = 1000000;
        experiment(n,t);
    }

    public static double calculateGini(double[] wealth){
        double sumOfAbsoluteDifferences = 0;
        double sumOfWealth =0;
        int n = wealth.length;
        for (int i = 0; i < n; i++) {
            sumOfWealth += wealth[i];
            for (int j = 0; j < n; j++) {
                sumOfAbsoluteDifferences += Math.abs(wealth[i] - wealth[j]);
            }

        }
        return sumOfAbsoluteDifferences/(2 * n * sumOfWealth);

    }

    public static void experiment(int n,int t){
        double[] wealth = new double[n];
        Arrays.fill(wealth,100);
        boolean[] hasMoney = new boolean[n];
        for (int i = 0; i < t; i++) {
            Arrays.fill(hasMoney,false);
            for (int j = 0; j < n; j++) {
                if (wealth[j] > 0){
                    hasMoney[j] = true;
                }

            }
            for (int j = 0; j < n; j++) {
                if (hasMoney[j]){
                    int other = j;
                    do {
                        other = (int)(Math.random()*n);

                    }while(other == j);
                    wealth[j]--;
                    wealth[other]++;

                }

            }
        }
        Arrays.sort(wealth);
        System.out.println("列出每个人的财富（贫穷到富有）：");
        for (int i = 0; i < n; i++) {
            System.out.print((int)wealth[i] + " ");
            if (i % 10 == 9){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("这个社会的基尼系数为：" + calculateGini(wealth));
    }


}
