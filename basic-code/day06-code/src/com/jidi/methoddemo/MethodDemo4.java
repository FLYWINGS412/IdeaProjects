package com.jidi.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //目标：掌握带参数方法定义的格式和调用的格式

        getSum(30, 40);
    }

    public static void getSum(int sum1, int sum2) {
        int result = sum1 + sum2;
        System.out.println(result);
    }
}
