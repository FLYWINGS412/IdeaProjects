// 练习题目：重新认识main方法

package com.jidi.staticdemo.a05staticdemo5;

public class Test {
    public static void main(String[] args) {
        // []：数组
        // string：数据类型
        // args：数组名

        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
