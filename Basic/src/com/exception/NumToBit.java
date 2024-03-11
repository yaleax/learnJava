package com.exception;

public class NumToBit {

    // 使用重载方法，当不传入位数时，默认打印32位
    public static void print(int num) {
        print(num, 32);
    }

    // 当传入位数时，使用传入的位数打印
    public static void print(int num, int bits) {
        // 确保输入的位数不超过整数的位数
        if (bits > 32) {
            bits = 32;
        } else if (bits < 1) {
            bits = 1;
        }

        // 开始打印从高位到低位的值
        for (int i = bits - 1; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 调用不带位数的print方法，默认打印32位
        print(-1);

        // 也可以调用带位数的方法，例如这里打印8的二进制表示的5位
        print(8, 5);
    }
}
