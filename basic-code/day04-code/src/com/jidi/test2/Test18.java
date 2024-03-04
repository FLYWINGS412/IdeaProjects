package com.jidi.test2;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        /*需求：键盘录入一个整数×。
        如果×是一个回文整数，打印true，否则，返回false解释：
        回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        例如，121是回文，而123不是。*/

        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        //请录入一个整数
        System.out.println("请录入一个整数");
        int x = sc.nextInt();
        //定义一个临时变量用于记录x原来的值，用于最后进行比较
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;

        //2.利用循环开始
        while (x != 0){
            //从右往左获取每一位数组
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }

        //3.打印num
        //System.out.println(temp);
        //System.out.println(num);

        //4.比较
        if(num == temp){
            System.out.println(temp+"是一个回文整数");
        }else System.out.println(temp+"不是一个回文整数");
    }
}
