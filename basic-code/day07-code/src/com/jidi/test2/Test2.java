// 练习题目：找质数

package com.jidi.test2;

public class Test2 {
    public static void main(String[] args) {
        // 判断101～200之间有多少个质数，并打印所有质数

        //定义一个变量，用来统计有多少个质数
        int count = 0;
        //外循环：遍历101~200这个范围，依次得到这个范围之内的每一个数字
        for (int i = 101; i <= 200; i++) {
            //继续判断i是否为一个质数
            boolean flag = true;
            //内循环：判断当前数字是否为一个质数。
            for (int j = 2; j < i; j++) {
                //j表示2~i之间的每一个数字
                if (i % j == 0) {
                    flag = false;
                    break;  //跳出单层循环，内循环
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是一个质数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个质数");
    }
}
