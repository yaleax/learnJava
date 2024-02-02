package com.suan.basic;

public class test {
    public static void main(String[] args) {
        char ch = '鹏'; // 要转换的字符
        String unicode = String.format("\\u%04X", (int) ch);
        System.out.println("Unicode representation: " + unicode);
    }
}
