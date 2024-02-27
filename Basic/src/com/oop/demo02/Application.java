package com.oop.demo02;

public class Application {
    public static void main(String[] args) {
        Student xiaohong = new Student();
        Student xiaoming = new Student();
        xiaoming.name = "小明";
        xiaoming.age = 19;
        xiaohong.name = "小红";
        xiaohong.age = 18;
        System.out.println(xiaoming.name);
    }
}
