// 练习题目：字符串的比较（扩展练习）

package com.jidi.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        // 1.假设我现在键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串abc");
        String str1 = sc.next();

        // 2.代码中再定义一个字符串abc
        String str2 = "abc";

        // 3.用==比较，这两者能一样吗？
        System.out.println(str1 == str2);   // 结果为false

        // 4.用equals比较
        boolean result = str1.equals(str2);
        System.out.println(result);     // 结果为true

        
        // 结论：
        // 以后只要想比较字符串的内容，就必须要用string里面的方法
    }
}
