package com.jidi.innerclassdemo.a03innerclassdemo3;

public class Test {
    public static void main(String[] args) {
        // 创建内部类的对象，并调用show方法
        Outer.inner oi = new Outer().new inner();

        oi.show();
    }
}
