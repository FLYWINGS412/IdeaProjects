package com.jidi.oopextends.a09oopextendsdemo9;

public class Student {
    String name;
    int age;
    String school;

    // 需求：
    // 默认为传智大学


    public Student() {
        this(null,0,"传智大学");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
