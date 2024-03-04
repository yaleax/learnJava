package com.oop;

import com.oop.Demo05.*;
import com.oop.Demo05.Person;
import com.oop.Demo05.Student;

public class Application {
    public static void main(String[] args) {
//        Teacher teacher = new Teacher();
//        Person person = new Person();
//        Student student = new Student();
//
//        student.test("joey");
//        A a = new A();
//        a.test();
//        B b = new A();
//        b.test();
//
//        com.oop.Demo06.Student student = new com.oop.Demo06.Student();
//        Person student1 = new com.oop.Demo05.Student();
//        Object student2 = new Student();
//
//        student.run();

        Object student = new Student();

        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
        System.out.println(student instanceof com.oop.Demo06.Teacher);


    }
}
