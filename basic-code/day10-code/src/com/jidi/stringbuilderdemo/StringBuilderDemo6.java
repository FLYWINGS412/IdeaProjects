// 练习题目：对称字符串
/* 需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
   对称字符串：123321、111
   非对称字符串：123123 */

/* 使用stringBuilder的场景：
   1.字符串的拼接
   2.字符串的反转 */

package com.jidi.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        // 1.键盘输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        // 2.反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();   // 链式编程

        // 3.判断是否是对称字符串
        if (str.equals(result)) {
            System.out.println(str + " 是对称字符串");
        } else {
            System.out.println(str + " 不是对称字符串");
        }
    }
}
