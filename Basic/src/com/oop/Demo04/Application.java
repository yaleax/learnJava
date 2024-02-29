package com.oop.Demo04;

public class Application {
    public static void main(String[] args) {
        Student joey = new Student();
            joey.setName("Joey") ;
        System.out.println(joey.getName());
        joey.setAge(-1);
        System.out.println(joey.getAge());
    }


}
