// 练习题目：键盘输入任意字符串，打乱里面的内容

package com.jidi.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 1.键盘输入任意字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        // 2.变成字符数组
        char[] arr = str.toCharArray();

        // 3.打乱数组里面的内容
        // 从0索引开始，跟一个随机索引进行位置的交换
        // 当数组里面的每一个元素都跟一个随机索引进行交换完毕之后，那么内容就打乱了
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        // 4.把字符数组再变回字符串
        String result = new String(arr);

        // 5.打印结果
        System.out.println(result);
    }
}
