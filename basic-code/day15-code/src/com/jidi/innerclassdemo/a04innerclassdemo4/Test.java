// 练习题目：静态内部类

/*
注意事项：
1.静态内部类也是成员内部类中的一种
2.静态内部类只能访问外部类中的静态变量和静态方法，

如果想要访问非静态的需要创建外部类的对象。
创建静态内部类对象的格式：
外部类名.内部类名对象名=new外部类名.内部类名（);
调用静态方法的格式：
外部类名.内部类名.方法名（)；
 */

package com.jidi.innerclassdemo.a04innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        // 创建静态内部类的对象
        Outer.inner oi = new Outer.inner();

        // 非静态的东西，需要通过对象获取
        oi.show1();

        System.out.println("-----------------");

        // 只要是静态的东西，都可以用类名点直接获取
        Outer.inner.show2();
    }
}
