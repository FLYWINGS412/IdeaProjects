// 练习题目：StringBuilder源码分析

package com.jidi.stringbuilderdemo;

public class StringBuilderDemo8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 容量：最多装多少
        // 长度：已经装了多少
        System.out.println(sb.capacity());      // 容量为16
        System.out.println(sb.length());        // 长度为0

        sb.append("abc");
        System.out.println(sb.capacity());      // 容量为16
        System.out.println(sb.length());        // 长度为3

        sb.append("defghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb.capacity());      // 容量为36（一次性超出容量，以实际需要扩容容量)
        System.out.println(sb.length());        // 长度为36

        sb.append("0123456789");
        System.out.println(sb.capacity());      // 容量为74（原容量 * 2 + 2)
        System.out.println(sb.length());        // 长度为46
    }
}
