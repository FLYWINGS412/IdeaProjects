package com.jidi.innerclassdemo.a05innerclassdemo5;

import java.sql.SQLOutput;

public class Outer {
    int b = 20;

    public void show() {
        int a = 10;

        // 局部内部类
        class Inner {
            String name;
            int age;

            public void method1() {
                System.out.println(a);          // 直接使用内部类的变量
                System.out.println(b);          // 直接使用外部类的变量
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2静态方法");
            }
        }

        // 创建局部内部类的对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();        // 通过类名直接调用静态方法
    }
}
