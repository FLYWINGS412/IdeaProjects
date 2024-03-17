package com.jidi.test4;

public class GirlFriend {
    // 属性
    private int age;    // 默认值为0

    // 行为
    public void method() {
        int age = 10;
        System.out.println(age);    // 谁离我近，我就用谁，打印值为10
        System.out.println(this.age);    // 打印成员变量，打印值为0
    }
}