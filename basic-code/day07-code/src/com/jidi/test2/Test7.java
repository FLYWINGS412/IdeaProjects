//练习题目：把整数上的每一位都添加到数组当中

package com.jidi.test2;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        // 需求：
        // 把整数上的每一位都添加到数组当中
        // 反射推导

        // 1.计算出数组的长度
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int number = sc.nextInt();

        //定义一个变量临时记录number的值，就是为了第三步的时候再次使用
        int temp = number;

        // 定义一个变量用来统计
        int count = 0;

        // 2.定义数组
        while (number != 0) {
            //每一次循环就去掉右边的一个数字
            number = number / 10;
            //去掉一位计数器就自增一次，
            count++;
        }

        // 动态初始化
        int[] arr = new int[count];

        // 3.把整数上的每一位都添加到数组当中
        int index = arr.length - 1;
        while (temp != 0) {
            //获取temp里面的每一位数组
            int ge = temp % 10;
            //再去掉右边的那位数字
            temp = temp / 10;
            //把当前获取到的个位添加到数组当中
            arr[index] = ge;
            index--;
        }

        // 验证结果
        System.out.print("数组值为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}