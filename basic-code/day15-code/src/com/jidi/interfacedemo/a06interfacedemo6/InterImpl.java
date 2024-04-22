package com.jidi.interfacedemo.a06interfacedemo6;

public class InterImpl implements InterA,InterB{
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    @Override
    public void show() {        // 如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
        System.out.println("重写接口中的默认方法");
    }
}
