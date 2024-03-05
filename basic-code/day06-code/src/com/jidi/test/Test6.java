package com.jidi.test;

public class Test6 {
    public static void main(String[] args) {
        //需求：设计一个方法求数组的最大值，并将最太值返回

        //1.定义一个数组
        int[] arr = {1, 5, 7, 3, 8, 10};

        //2.调用方法求数组的最大值
        int max = getmax(arr);

        //3.打印数组的最大值
        System.out.println("数组的最大值为：" + max);
    }

    //1.我要干嘛？ 求数组的最大值
    //2.我干这件事情，需要什么才能完成？ 需要数组
    //3.是否返回？ 需要返回
    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //返回数组的最大值
        return max;
    }
}
