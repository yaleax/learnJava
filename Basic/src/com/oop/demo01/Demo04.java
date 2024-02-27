package com.oop.demo01;

public class Demo04 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        Demo04.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        person.name="joey";
    }
}
class Person{
    String name;
}