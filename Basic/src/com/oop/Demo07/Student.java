package com.oop.Demo07;

public class Student {
    private static int age;
    private double score;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(Student.age);
//        System.out.println(Student.score);
        System.out.println(student.age);
        System.out.println(student.score);
    }
}
