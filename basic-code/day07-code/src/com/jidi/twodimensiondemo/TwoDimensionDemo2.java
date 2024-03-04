//练习题目：二维数组动态初始化

package com.jidi.twodimensiondemo;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /* 二维数组动态初始化格式：
          数据类型[][]数组名=new数据类型[m][n];
          m表示这个二维数组，可以存放多少个一维数组
          n表示每一个一维数组，可以存放多少个元素
         */

        // 1.创建二维数组
        // 3：表示二维数组长度为3，可以装3个一维数组
        // 5：表示每一个一维数组的长度都是5，可以装5个int类型的元素
        int[][] arr = new int[3][5];

        // 给二维数组赋值一个元素
        arr[0][0] = 10;

        // 遍历二维数组
        // 外循环：遍历二维数组获取里面的每一个一维数组
        // 内循环：遍历一维数组获取每一个元素

        // 外循环
        for (int i = 0; i < arr.length; i++) {

            // 内循环
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
