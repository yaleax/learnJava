package com.oop.basic;

public class Employee {
    int id;
    String name;
    int age;
    long salary;

    MyDate birthday;




    public void printInfo(){
        System.out.println(this.name +"'s"+ "staff id is "+id +"and age "+ age +"and salary is"+ salary);
    }
}
