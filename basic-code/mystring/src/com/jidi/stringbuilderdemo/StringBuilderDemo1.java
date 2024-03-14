// 练习题目：字符串添加内容

package com.jidi.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s = s + "abc";
        }
        System.out.println(s);
    }
}
