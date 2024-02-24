package com.suan.method;
import java.util.Scanner;
public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Please enter the first number:");
            double a = scanner.nextDouble();
            System.out.println("Please enter the second number:");
            double b = scanner.nextDouble();
            System.out.println("Please enter the operator:");
            String operator = scanner.next();
            switch (operator){
                case "+":
                    System.out.println(add(a,b));
                    break;
                case "-":
                    System.out.println(subtract(a,b));
                    break;
                case "*":
                    System.out.println(multiply(a,b));
                    break;
                case "/":
                    System.out.println(divide(a,b));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }
    public static double add(double a,double b){
        return a + b;
    }
    // Addition, subtraction, multiplication and division
    public static double subtract(double a,double b){
        return a - b;
    }
    public static double multiply(double a,double b){
        return a * b;
    }
    public static double divide(double a,double b){
        if (b == 0){
            System.out.println("The divisor cannot be 0");
        }
        return a / b;
    }
}
