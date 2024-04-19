package com.jidi.codeblockdemo.demo1;

public class Student {
    private String name;
    private int age;

    // 构造代码块：
    // 1.写在成员位置的代码块
    // 2.作用：可以把多个构造方法中重复的代码抽取出来
    // 3.执行时机：我们在创建本类对象的时候会先执行构造代码块再执行构造方法
    // 4.缺点：每次创建对象的时候都会运行构造代码块，所以构造代码块不够灵活。
    {
        System.out.println("开始创建对象了");      // 将方法中重复的代码抽取到构造代码块中
    }

    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
