package com.jidi.demo;

public class VariableDemo2{
    //主入口
    public static void main(String[] args){
        //1.基本用法
        //定义变量，再进行输出
        int a = 10;
        System.out.println(a);//10
        System.out.println(a);//10
        System.out.println(a);//10

        //2.变量参与计算
        int b = 30;
        int c = 20;
        System.out.println(b+c);//50

        //3.修改变量记录的值
        a = 50;
        System.out.println(a);//50

        System.out.println("-----------------------");

        //注意事项
        //在一条语句中，可以定义多个变量
        int d = 100, e = 200, f=300;
        System.out.println(d);//100
        System.out.println(e);//200
        System.out.println(f);//300

        //变量在使用之前必须要赋值
        //int g;
        //g = 500;
        //建议：以后在定义变量的时候，请直接赋值
        //不要把赋值分开写。
        int g = 500;
        System.out.println(g);
    }
}