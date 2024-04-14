package com.jidi.staticdemo.a04staticdemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿玮老师";

        Student s1 = new Student();
        System.out.println("s1地址值：" + s1);
        s1.name = "张三";
        s1.age = 23;
        s1.show1();

        System.out.println("================");

        Student s2 = new Student();
        System.out.println("s2地址值：" + s2);
        s2.name = "李四";
        s2.age = 24;
        s2.show1();
    }
}
