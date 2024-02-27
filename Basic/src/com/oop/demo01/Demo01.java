package com.oop.demo01;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(max(3,65));

    }

    public static String sayHello(){
        return "Hello World";

    }
    public static int max(int a,int b){
        return a > b ? a : b;
    }

    public static void readFile(String file) throws IOException{

    }
}
