package com.jidi.innerclassdemo.a04innerclassdemo4;

import java.sql.SQLOutput;

public class Outer {
    int a = 10;
    static int b = 20;

    // 静态内部类
    static class inner{
        public void show1(){
            // System.out.println(a);          // 直接调用外部类非静态变量报错
            Outer o = new Outer();             // 创建外部类对象
            System.out.println(o.a);           // 通过对象调用外部类非静态变量
            System.out.println(b);             // 直接调用外部类静态变量

            System.out.println("非静态的方法被调用了");
        }

        public static void show2(){
            // System.out.println(a);          // 直接调用外部类非静态变量报错
            Outer o = new Outer();             // 创建外部类对象
            System.out.println(o.a);           // 通过对象调用外部类非静态变量
            System.out.println(b);             // 直接调用外部类静态变量

            System.out.println("静态的方法被调用了");
        }
    }
}
