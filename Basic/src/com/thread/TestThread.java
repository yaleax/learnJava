package com.thread;

public class TestThread extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("A"+ i);

        }

    }

    public static void main(String[] args) {
        TestThread t = new TestThread();
        t.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("B"+ i);
        }
    }
}
