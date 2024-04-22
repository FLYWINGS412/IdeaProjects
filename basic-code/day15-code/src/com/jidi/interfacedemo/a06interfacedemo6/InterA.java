package com.jidi.interfacedemo.a06interfacedemo6;

public interface InterA {
    public abstract void method();

    public default void show(){     // public可以省略，default不能省略
        System.out.println("InterA接口中的默认方法 --- show");
    }
}
