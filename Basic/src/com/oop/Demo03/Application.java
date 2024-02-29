package com.oop.Demo03;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "Joey";
        dog.age = 3;
        System.out.println(dog.name);
        System.out.println(dog.age);
        dog.shout();

    }
}
