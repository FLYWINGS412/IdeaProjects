package com.jidi.innerclassdemo.a06innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
        //整体我们可以理解为swim接口的实现类对象

        //方法一：
        Swim s = new Swim() {      //接口多态

            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        };

        //编译看左边，运行看右边的原则
        s.swim();


        //方法二：
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写之后的游泳方法");
            }
        }.swim();           //调用匿名内部类的方法
    }
}
