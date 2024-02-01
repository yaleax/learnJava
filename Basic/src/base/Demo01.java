package base;

public class Demo01 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;
        System.out.println(i);
        System.out.println(b);
        int money = 10_0000_0000;
        int year = 20;
        int total = money * year;
        System.out.println(total);
        long total1 = money * ((long)year);
        System.out.println(total1);
    }
}
