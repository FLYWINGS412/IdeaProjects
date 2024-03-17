// 练习题目：StringJoiner练习

package com.jidi.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        // 1.创建对象
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        // 2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();      // 字符长度

        // 3.转成字符串
        String str = sj.toString();

        // 3.打印
        System.out.println(sj);     // [aaa, bbb, ccc]
        System.out.println(len);    // 15个字符，字符统计包括空格
        System.out.println(str);    // 打印字符串
    }
}
