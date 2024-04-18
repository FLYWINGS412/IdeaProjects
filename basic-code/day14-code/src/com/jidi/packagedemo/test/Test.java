// 练习题目：包用使用规则

/* 需求
1. 使用同一个包中的类时，不需要导包。
2. 使用java.lang包中的类时，不需要导包，
3. 其他情况都需要导包
4. 如果同时使用两个包中的同名类，需要用全类名
 */

package com.jidi.packagedemo.test;

public class Test {
    public static void main(String[] args) {
        // 1. 使用同一个包中的类时，不需要导包
        // 创建对象
        Student stu = new Student();

        stu.setName("张三");
        stu.setAge(23);

        System.out.println(stu.getName() + ", " + stu.getAge());

        // 2.使用java.lang包中的类时，不需要导包
        String s = "abc";
        System.out.println(s);

        // 3.其他情况都需要导包（没导包的情况下需要输入全类名）
        com.jidi.packagedemo.domian1.teacher t1 = new com.jidi.packagedemo.domian1.teacher();
        t1.setName("李四");
        t1.setAge(24);
        System.out.println(t1.getName() + ", " + t1.getAge());

        // 4.如果同时使用两个包中的同名类，需要用全类名
        com.jidi.packagedemo.domian2.teacher t2 = new com.jidi.packagedemo.domian2.teacher();
        t2.setName("王五");
        t2.setAge(25);
        System.out.println(t2.getName() + ", " + t2.getAge());
    }
}
