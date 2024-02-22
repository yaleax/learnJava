package com.suan.method;
import java.util.Scanner;
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    public static double add(double a,double b){
        return a + b;
    }
    // Addition, subtraction, multiplication and division
    public static double subt(double a,double b){
        return a - b;
    }
    public static double multi(double a,double b){
        return a * b;
    }
    public static double divi(double a,double b){
        if (b == 0){
            System.out.println("The divisor cannot be 0");
            return 0;
        }
        return a / b;
    }
}
