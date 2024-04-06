package com.thread;

public class TestThread4 implements Runnable{
    private int ticketNum = 10;
    @Override
    public void run(){
        while (true){
            if (ticketNum <=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"抢了第"+ ticketNum--+"张票");
        }

    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();
        new Thread(ticket,"joey").start();
        new Thread(ticket,"echo").start();
        new Thread(ticket,"miki").start();
    }
}
