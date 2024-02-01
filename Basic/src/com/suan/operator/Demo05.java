package com.suan.operator;

public class Demo05 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);

        int c = 5;
        boolean d = (c < 4) && (c++ < 10);
        System.out.println(c);
        System.out.println(d);
    }
}
