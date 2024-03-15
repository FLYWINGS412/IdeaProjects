// 练习题目：StringJoine练习

package com.jidi.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        // 1.创建一个对象，并指定中间的间隔符号
        StringJoiner sj = new StringJoiner("---");

        // 2.添加元素
        sj.add("aaa").add("bbb").add("ccc");     // 链式编程

        // 3.打印
        System.out.println(sj);
    }
}
