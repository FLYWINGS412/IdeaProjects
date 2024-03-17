// 练习题目：遍历字符串

// 需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

package com.jidi.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        // 2.遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // i依次表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
