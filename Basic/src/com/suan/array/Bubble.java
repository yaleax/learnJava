package com.suan.array;

import java.util.Arrays;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        Random random = new Random(); //创建Random对象
        int size = random.nextInt(1000) + 1;//随机生成0-100的数字
        int [] randomArray = new int[3];
        for (int i = 0; i < 3; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        System.out.println("Random array is: ");
        System.out.println(Arrays.toString(randomArray));
        System.out.println("After BubblingSort: ");
        int temp = 0;
        for (int i = 0; i < randomArray.length-1; i++) {
            for (int j = 0; j < randomArray.length-1-i; j++) {
                if (randomArray[j] > randomArray[j + 1]){
                    temp = randomArray[j];
                    randomArray[j] = randomArray[j + 1];
                    randomArray[j + 1] = temp;
                    System.out.println(Arrays.toString(randomArray));

                }
                System.out.println(Arrays.toString(randomArray));
            }

        }
        System.out.println(Arrays.toString(randomArray));

    }
}

