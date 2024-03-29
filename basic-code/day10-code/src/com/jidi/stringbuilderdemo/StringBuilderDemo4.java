package com.jidi.stringbuilderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        // 1.创建对象
        StringBuilder sb = new StringBuilder();

        // 2.添加字符串
        // sb.append("aaa");
        // sb.append("bbb");
        // sb.append("ccc");
        // sb.append("ddd");
        sb.append("aaa").append("bbb").append("ccc").append("ddd");     // 链式编程

        // 3.再把stringBuilder变回字符串
        String str = sb.toString();

        // 3.打印
        System.out.println(str);        //aaabbbcccddd
    }
}
