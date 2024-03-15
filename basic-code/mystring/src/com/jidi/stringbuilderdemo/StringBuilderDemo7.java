// 练习题目：拼接字符串
/* 需求：定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
   调用该方法，并在控制台输出结果。
   例如：数组为int[] arr ={1,2,3};
   执行方法后的输出结果为：[1，2,3] */

package com.jidi.stringbuilderdemo;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {1, 2, 3};

        // 2.调用方法把数组变成字符串
        String str = arrToString(arr);
        System.out.println(str);
    }

    // 我要做什么     字符串拼接
    // 我需要什么     需要数组
    // 是否需要返回    需要返回字符串
    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
