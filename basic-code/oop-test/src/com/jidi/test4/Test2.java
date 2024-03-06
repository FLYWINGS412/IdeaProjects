//练习题目：键盘录入的两套体系扩展练习

package com.jidi.test4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 键盘录入的两套体系不能混用的
        // 混用的弊端：先用nextInt，再用nextLine会导致下面的nextLine接受不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");      // 输入123 456
        int num1 = sc.nextInt();
        System.out.println(num1);       // 打印结果为123

        System.out.println("请输入一个字符串");     // 运行时直接跳过了录入
        String num2 = sc.nextLine();
        System.out.println(num2);       // 打印结果为“ 456”
    }
}
