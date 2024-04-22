package com.jidi.interfacedemo.a07interfacedemo7;

public class InterImpl implements Inter{

    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

    // 这里不是重写的静态方法，只是与Inter接口重名
    // 子类把从父类继承下来的虚方法表里面的方法进行覆盖了，这才叫重写。
    public static void show() {
        System.out.println("InterImpl重写的抽象方法");
    }
}
