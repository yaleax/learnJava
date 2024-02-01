package com.suan.operator;

public class Demo08 {
    public static void main(String[] args) {
        // x ? y : z

        int score = 50;
        String type = score < 60 ? "Fail" : "Pass";
        System.out.println(type);
    }
}
