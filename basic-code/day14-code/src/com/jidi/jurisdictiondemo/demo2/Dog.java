package com.jidi.jurisdictiondemo.demo2;

import com.jidi.jurisdictiondemo.demo1.Animal;

public class Dog extends Animal {
    public void show(){
        // System.out.println(name);       // 不同包下的子类中，变量name被private修饰，直接调用报错
        // System.out.println(name);       // 不同包下的子类中，变量name默认修饰，可以直接调用，直接调用报错
        System.out.println(name);          // 不同包下的子类中，变量name被protected修饰，可以直接调用
        System.out.println(name);          // 不同包下的子类中，变量name被public修饰，可以直接调用
    }
}
