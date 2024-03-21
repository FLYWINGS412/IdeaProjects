package com.jidi.test5;

public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        // 调用的空参构造
        // 如果已写有参构造，就不能调用student的无参构造
        // Student s = new Student();

        Student s = new Student("张三",25);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
