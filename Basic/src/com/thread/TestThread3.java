package com.thread;

public class TestThread3  implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("A"+ i);

        }

    }

    public static void main(String[] args) {
        TestThread3 t = new TestThread3();

        new Thread(t).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("B"+ i);
        }
    }

}
