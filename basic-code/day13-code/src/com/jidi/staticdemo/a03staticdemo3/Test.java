package com.jidi.staticdemo.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 1.创建一个集合用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        // 2.创建学生对象
        Student stu1 = new Student("张三", 23, "男");
        Student stu2 = new Student("李四", 24, "男");
        Student stu3 = new Student("王五", 25, "男");

        // 3.将学生对象添加到集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        // 4.调用StudentUtil工具类中的方法
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);

        // 5.打印结果
        System.out.println("学生的最大年龄为：" + maxAgeStudent);
    }
}
