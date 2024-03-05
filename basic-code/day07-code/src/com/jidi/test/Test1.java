// 练习题目：买飞机票

package com.jidi.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/

        //分析：
        //1.键盘录入机票原价、月份、头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();

        System.out.println("请输入当前的月份");
        int month = sc.nextInt();

        System.out.println("请输入当前购买的舱位 0（代表：头等舱） 1（代表：经济舱）");
        int seat = sc.nextInt();


        //2.先判断月份是旺季还是淡季工
        if (month >= 5 && month <= 10) {
            //旺季
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4)||(month >= 11 && month <= 12)){
            //淡季
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else{
            //表示键盘录入的月份是一个非法数据
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println("机票的价格为"+ticket+" 元");
    }

    //建立方法的技巧：ctrl + alt + M 自动抽取方法
    //1.我要干嘛？   根据舱位和折扣来计算最终的票价
    //2.我干这件事，需要什么才能完成？     原价舱位头等舱的折扣经济舱的折扣
    //3.方法的调用处是否需要继续使用这个结果。     需要
    public static int getPrice(int ticket, int seat, double v1, double v2) {
        if (seat == 0) {   //头等舱
            ticket = (int) (ticket * v1);
        } else if (seat == 1) {   //经济舱
            ticket = (int) (ticket * v2);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
