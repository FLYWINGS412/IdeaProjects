package com.jidi.test2;

public class Test2 {
    public static void main(String[] args) {
        //需求：定义一个方法，求圆的面积，将结果在方法中进行打印。
        //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法

        getArea(1.5);
    }

    //1.我要干嘛？求圆的面积
    //2.我干这件事情，需要什么才能完成？需要半径的平方
    public static void getArea(double radius) {
        double result = radius * radius * 3.14;
        System.out.println("圆的面积为：" + result + "平方米");
    }
}
