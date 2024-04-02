package com.oop.basic;

public class EmplyeeTest {
    public static void main(String[] args) {
        Employee joey = new Employee();
        Employee echo = new Employee();
        System.out.println(joey);
        joey.printInfo();
        joey.birthday = new MyDate();

        joey.birthday.day = 21;
        joey.birthday.moth = 2;
        joey.birthday.year = 2003;
        System.out.println(joey.birthday.year + "年" + joey.birthday.moth +"月"+ joey.birthday.day + "日");

    }
}
