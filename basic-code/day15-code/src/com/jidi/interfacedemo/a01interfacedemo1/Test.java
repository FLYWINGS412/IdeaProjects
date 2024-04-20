// 练习题目：编写带有接口和抽象类的标准javabean类

package com.jidi.interfacedemo.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        // 创建青蛙对象
        Frog f = new Frog("小青", 1);
        System.out.println(f.getName() + ", " + f.getAge());

        f.eat();
        f.swim();

        System.out.println("-------------");

        // 创建兔子对象
        Rabbit r = new Rabbit("小白",2);
        System.out.println(f.getName() + ", " + f.getAge());

        r.eat();
    }
}
