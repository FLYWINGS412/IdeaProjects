// 练习题目：多态练习

package com.jidi.polyorphismdemo.a04polyorphismdemo4;

public class Test {
    public static void main(String[] args) {
        /* 第一种方法
        // 创建饲养员对象
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        // 创建动物对象
        Dog d = new Dog(2,"黑");
        Cat c = new Cat(3,"灰");

        // 单独调用方法
        p1.keepPet(d,"骨头");
        d.lookHome();

        System.out.println("--------------------------------");

        p2.keepPet(c,"鱼");
        c.catchMouse();
        */

        // 第二种方法
        // 创建饲养员对象
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        // 创建动物对象
        Animal a1 = new Dog(2,"黑");
        Animal a2 = new Cat(3,"灰");

        // 调用方法
        p1.keepPet(a1,"骨头");
        System.out.println("--------------------------------");
        p2.keepPet(a2,"鱼");
    }
}
