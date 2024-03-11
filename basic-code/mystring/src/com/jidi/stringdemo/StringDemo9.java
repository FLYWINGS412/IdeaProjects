// 练习题目：金额转换

package com.jidi.stringdemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        // 1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请录入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }

        //定义一个变量用来表示钱的大写
        String moneyStr = "";

        // 2.得到money里面的每一位数字，再转成中文
        while (true) {
            // 从右往左获取数据，因为右侧是数据的个位
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);

            // 把转换之后的大写拼接到moneyStr当中
            moneyStr = capitalNumber + moneyStr;

            // 去掉刚刚获取的数据
            money = money / 10;

            // 如果数字上的每一位全部获取到了，那么money记录的就是o，此时循环结束
            if (money == 0) {
                break;
            }
        }
        // 3.在前面补0，补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        // 4.插入单位
        // 定义一个数组表示单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        // 5.遍历moneyStr，依次得到大写数字
        // 然后把arr的单位插入进去
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);

            // 把大写数字和单位拼接到result当中
            result = result + c + arr[i];
        }
        System.out.println("金额大写为：" + result);
    }


    // 要做什么？        定义一个方法把数字变成大写的中文
    // 需要什么？        数字
    // 需要返回？        需要返回大写
    public static String getCapitalNumber(int number) {
        // 定义数组，让数字跟大写的中文产生一个对应关系
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

        // 返回结果
        return arr[number];
    }
}