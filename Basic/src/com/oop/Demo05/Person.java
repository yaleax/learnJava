package com.oop.Demo05;

public class Person {
    private int money = 10_0000_0000;
    public void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    protected String name = "kuanshen";
}
