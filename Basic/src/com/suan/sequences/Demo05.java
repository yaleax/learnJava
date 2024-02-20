package com.suan.sequences;

public class Demo05 {
    public static void main(String[] args) {
        char grade = 't';
        switch (grade) {
            case 'a':
                System.out.println("优秀");
                break;
            case 'b':
                System.out.println("良好");
                break;
            case 'c':
                System.out.println("中等");
                break;
            case 'd':
                System.out.println("及格");
                break;
            case 'f':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
