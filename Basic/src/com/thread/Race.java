package com.thread;

public class Race implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }

}
