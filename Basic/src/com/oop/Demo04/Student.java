package com.oop.Demo04;

public class Student {
    private String name;
    private int id;
    private char sex;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 150 || age < 0){
            this.age = 3;}
        else {
            this.age = age;
        }
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex(){
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
