package com.suan.sequences;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i == 20){
                continue;
            }
            System.out.println(i);
            if (i == 50) {
                break;
            }

        }
        System.out.println("End of the loop");
    }
}
