package com.oop.basic;

public class PersonTest {
    public static void main(String[] args) {
        Person joey = new Person();
        joey.name = "joey";
//        joey.age = 20;
        joey.gender = '男';
//        System.out.println(joey.name + joey.age + joey.gender);
        joey.eat();
        joey.sleep(12);
        joey.interests("吃好吃的 ");
    }
}
