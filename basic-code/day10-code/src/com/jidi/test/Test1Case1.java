// 练习题目：转换罗马数字（利用查表法进行匹配）

/* 需求:
   键盘录入一个字符串，
   要求1：长度为小于等于9
   要求2：只能是数字
   将内容变成罗马数字
   下面是阿拉伯数字跟罗马数字的对比关系：
   Ⅰ-1、Ⅱ-2、Ⅲ-3、Ⅳ-4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9

   注意点:
   罗马数字里面是没有0的
   如果键盘录入的数字包含0，可以变成””(长度为0的字符串) */

package com.jidi.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1Case1 {
    public static void main(String[] args) {
        String str = "";

        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个小于等于9位数的数字");
            str = sc.next();

            // 2.检查输入是否正确
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入不满足要求！请确保输入的是单个数字且小于等于9。");
            }
        }

        // 3.将内容变成罗马数字
        // 查表法：数字跟数据产生一个对应关系
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;        // 字符转成数字
            String s = changeLuoMa(number);     //转换成罗马数字
            sb.append(s);
        }

            // 4.打印
            System.out.println("罗马数字表示为：" + sb);
        }

        public static boolean checkStr (String str){
            // 要求1：长度为小于等于9
            if (str.length() > 9) {
                return false;
            }

            // 要求2：只能是数字
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
            }
            // 只有当字符串里面所有的字符全都判断完毕了，我才能认为当前的字符串是符合规则
            return true;
        }

        public static String changeLuoMa ( int number){
            // 定义一个数组，让索引跟罗马数字产生一个对应关系
            String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
            return arr[number];
        }
    }