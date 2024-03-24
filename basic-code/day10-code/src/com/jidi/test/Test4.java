// 练习题目：生成验证码

/* 内容：可以是小写字母，也可以是大写字母，还可以是数字
   规则：
   长度为5
   内容中是四位字母，1位数字。
   其中数字只有1位，但是可以出现在任意的位置。 */

package com.jidi.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        // 1.可以把所有的大写字母，小写字母都放到一个数组当中
        char[] arr = new char[52];

        // 将所有的大小写字母放到数组中
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('A' + i);
            arr[i + 26] = (char) ('a' + i);
        }

        // 2.从数组中随机获取4次
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            sb.append(arr[index]);
        }

        // 3.生成一个0~9之间的随机数拼接到最后
        int number = r.nextInt(10);        // 生成一个0~9之间的随机
        int index = r.nextInt(sb.length()+1);      // 生成交换元素索引
        sb.insert(index,number);        // 将随机数插入到StringBuilder中

        // 4.打印结果
        System.out.println(sb.toString());
    }
}
