// 练习题目：final修饰的常量使用细节

package com.jidi.finaldemo.test2;

import com.jidi.packagedemo.test.Student;

public class Test {
    public static void main(String[] args) {
        // final修饰引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的
        // 1.对象
        final Student S = new Student("张三", 23);     // 用final修饰对象类
        System.out.println(S);                                   // 地址值：@4eec7777
        System.out.println(S.getName() + ", " + S.getAge());     // 张三, 23

        System.out.println("-------------------------------------------");

        S.setName("李四");
        S.setAge(24);
        System.out.println(S);                                   // 地址值：@4eec7777
        System.out.println(S.getName() + ", " + S.getAge());     // 李四, 24          （变量值改变）

        System.out.println("-------------------------------------------");

        // 2.数组
        final int[] ARR = {1, 2, 3, 4, 5};                       // 用final修饰数组
        for (int i = 0; i < ARR.length; i++) {
            int a = ARR[i];
            System.out.print(a + ", ");                          // 数组值：1，2，3，4，5（改变）
            System.out.println(ARR);                             // 地址值：[I@7ef20235 （地址值不变）
        }

        ARR[0] = 10;
        ARR[1] = 20;
        for (int i = 0; i < ARR.length; i++) {
            int a = ARR[i];
            System.out.print(a + ", ");                           // 数组值：10，20，3，4，5（改变）
            System.out.println(ARR);                              // 地址值：[I@7ef20235 （地址值不变）
        }
    }
}

// 核心：常量记录的数据是不能发生改变的。
