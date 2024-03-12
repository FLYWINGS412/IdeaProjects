// 练习题目：身份证信息查看

package com.jidi.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        // 1.定义一个字符串记录身份证号码
        String id = "450111197205054878";

        // 2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("人物信息为：");
        System.out.println("出日年月日：" + year + "年 " + month + "月 " + day + "日");

        // 3.获取性别
        char gender = id.charAt(16);
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
