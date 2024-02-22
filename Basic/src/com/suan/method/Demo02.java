package com.suan.method;

public class Demo02 {
    public static void main(String[] args) {
        //比大小
        String result = getMax(20.0, 10.0);
        System.out.println( result);
    }
    public static String getMax(int a, int b){

        String result = "一样大";
        if (a > b){
            return Integer.toString(a);
        }
        if (a < b){
            return Integer.toString(b);
        }
        else {
            return result;
        }
    }
    public static String getMax(double a, double b){

        String result = "一样大";
        if (a > b){
            return Double.toString(a);
        }
        if (a < b){
            return Double.toString(b);
        }
        else {
            return result;
        }
    }
}
