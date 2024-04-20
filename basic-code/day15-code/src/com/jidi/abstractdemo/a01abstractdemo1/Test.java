// 练习题目：抽象类的定义格式和注意事项

package com.jidi.abstractdemo.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        // Person p = new Person();        // 抽象类不能创建对象

        // 创建子类对象
        Student s = new Student("张三", 23);

        System.out.println(s.getName() + ", " + s.getAge());
    }
}
