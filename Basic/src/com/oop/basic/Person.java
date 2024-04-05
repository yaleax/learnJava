package com.oop.basic;

public class Person {

    String name;
    private int age;
    char gender;

    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hour){
        System.out.println("人至少保证每天" + hour + "小时睡眠");
    }
    public  void interests(String hobby){
        System.out.println("我的爱好是" + hobby);

    }
    public void setAge(int age){
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
