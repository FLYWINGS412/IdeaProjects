// 练习题目：字符串转成整数

/* 键盘输入两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
注意：需要用已有的知识完成。
     不需要考虑乘积过大之后的结果
     就认为乘积一定是小于int的最大值的 */

package com.jidi.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 1.键盘输入两个整数的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        String num1 = sc.next();
        System.out.println("请输入第二个整数");
        String num2 = sc.next();

        // 2.把num1和num2变成对应的整数
        int number1 = stringToInt(num1);
        int number2 = stringToInt(num2);

        // 3.利用整数进行想成乘
        int number3 = number1 * number2;

        // 4.把它们的乘积也表示为字符串形式
        String result = "" + number3;

        // 5.打印乘积
        System.out.println("乘积为：" + result);
    }

    // 要做什么？    把字符串num1和num2变成对应的整数
    // 需要什么？    字符串num1和num2
    // 需要返回？    返回整数
    public static int stringToInt(String str) {
        int result = 0;

        // 先遍历字符串依次得到每一个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 将字符转换为数字
            int number = c - 48;

            // 把每一个数字组合到一起形成整数
            result = result * 10 + number;
        }
        return result;
    }
}
