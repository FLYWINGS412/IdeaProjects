// 练习题目：成员内部类

/*
编写成员内部类的注意点：
1.成员内部类可以被一些修饰符所修饰，比如：private，默认，protected，public，static等
2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。

获取成员内部类对象的两种方式：
方式一：外部类编写方法，对外提供内部类对象
方式二：直接创建
格式：外部类名.内部类名对象名=外部类对象.内部类对象；
范例： Outer.Inner oi = new Outer().new Inner();
 */


package com.jidi.innerclassdemo.a02innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        // 创建成员内部类对象
        // Outer.inner oi = new Outer().new inner();    // 不能创建private修饰的内部类

        // 创建外部类对象
        Outer o = new Outer();                      // 通过创建外部类，调用方法来获得内部类
        Object instance = o.getInstance();          // 通过Outer的父类（Object）进行接收
        System.out.println(o.getInstance());        // 或者直接打印结果 @3b07d329
    }
}
