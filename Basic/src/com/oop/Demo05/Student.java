package com.oop.Demo05;

public class Student extends Person{

    private String name = "qinjiang";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}
