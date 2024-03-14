// 练习题目：StringBuilder方法

package com.jidi.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        // 1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        // 2.添加元素
        // sb.append(1);            int类型
        // sb.append(2.3);          double类型
        // sb.append(true);         boolean类型
        // sb.reverse();            反转
        // int len = sb.length();     //获取长度


        // 3.打印
        System.out.println(sb);
    }
}

// 知识普及：
// 因为StringBuilder是Java已经写好的类
// java在底层对他做了一些特殊处理
// 打印对象不是地址值而是属性值。