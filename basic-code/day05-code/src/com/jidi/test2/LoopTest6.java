package com.jidi.test2;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        //需求：
        //随机数范围：1~100

        //创建对象
        Random r = new Random();
        int number = r.nextInt(100) + 1; //1 ~ 100
        System.out.println(number);

        //秘误
        //用来生成任意数到任意数之间的随机数7~15
        //1.让这个范围头尾都减去一个值，让这个范围从0开始 0 ~ 8
        //2.尼巴+1 8 + 1 = 9
        //3.最终的结果，再加上第一步减去的值。
        /* Random r = new Random();
        int number = r.nextInt(9) + 7;//生成7 ~ 15的随机数
        0 - 8 + 7
        7 ~ 15
        System.out.println(number); */
    }
}
