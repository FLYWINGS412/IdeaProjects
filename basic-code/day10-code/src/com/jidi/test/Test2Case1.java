// 练习题目：调整字符串（substring截取法）

/* 给定两个字符串，A和B
   A的旋转操作就是将A最左边的字符移动到最右边
   例如，若A='abcde'，在移动一次之后结果就是'bcdea'
   如果在若干次调整操作之后，A能变成B，那么返回True。
   如果不能匹配成功，则返回false */

package com.jidi.test;

public class Test2Case1 {
    public static void main(String[] args) {
        // 1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";

        // 2.旋转字符串
        boolean result = check(strA, strB);

        // 3.打印
        System.out.println(result);
    }

    // 作用：旋转字符串，把左侧的字符移动到右侧去
    // 形参：旋转前的字符串
    // 返回值：旋转后的字符串
    public static String rotate(String str) {
        // 套路：
        // 如果我们看到要修改字符串的内容
        // 可以有两个办法：
        // 方法一：用substring进行截取，把左边的字符截取出来拼接到右侧去

        // 截取思路
        // 获取最左侧那个字符
        char first = str.charAt(0);

        // 获取剩余的字符
        String end = str.substring(1);
        return end + first;
    }

    // 循环旋转并比较
    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }

        // 所有的情况都比较完毕了，还不一样，那么直接返回false
        return false;
    }
}