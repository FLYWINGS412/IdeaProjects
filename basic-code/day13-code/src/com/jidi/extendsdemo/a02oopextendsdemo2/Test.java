// 练习题目：构造方法不能被继承

package com.jidi.extendsdemo.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        // 利用空参构造创建子类对象
        Zi z1 = new Zi();       // 如果一个类中没有构造方法，虚拟机会自动的给你添加一个默认的空参构造

        // 利用带参构造创建子类对象
        // Zi z2 = new Zi("张三",23);        //构造方法不能被继承，所以报错
    }
}