package com.jidi.test;

public class Test1 {
    public static void main(String[] args) {
        //需求：定义一个方法，求长方形的周长，将结果在方法中进行打印

        //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法

        getlenght(5.2, 1.3);
    }

    //1.我要干嘛？求长方形的周长
    //2.我干这件事情，需要什么才能完成？需要长和宽

    public static void getlenght(double len, double width) {
        double sum = (len + width) * 2;
        System.out.println("长方形的周长为：" + sum);
    }
}
