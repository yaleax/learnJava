package com.Arry;

public class Demo01 {



    public static void main(String[] args) {
        double[] prices = new double[]{20.32,43.21,43.22};
        String[] foods = new String[]{"拌海蜇","龙须菜 ","炝冬笋","玉兰片"};

        String[] foods2 = new String[3];
        System.out.println(foods.length);
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
    }

}
