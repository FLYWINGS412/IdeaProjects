package com.jidi.jurisdictiondemo.demo2;

import com.jidi.jurisdictiondemo.demo1.Animal;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        // System.out.println(a.name);     // 不同包下的无关类中，变量name被private修饰，直接调用报错
        // System.out.println(a.name);     // 不同包下的无关类中，变量name默认修饰，直接调用报错
        // System.out.println(a.name);     // 不同包下的无关类中，变量name被protected修饰，直接调用报错
        System.out.println(a.name);     // 无关类中，变量name被public修饰，可以直接调用
    }
}
