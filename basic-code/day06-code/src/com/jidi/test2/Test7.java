package com.jidi.test2;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处

        //1.定义数组
        int[] arr = {1, 5, 8, 12, 56, 89, 34, 67};

        //2.键盘录入一个需要查找的数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个需要查找的数：");
        int number = sc.nextInt();

        //3.调用方法，查找录入的数是否存在数组中
        boolean flag = contains(arr,number);

        //4.判断一个数字在数组中是否存在了
        if(flag) {
            System.out.println(number + " 存在");
        }else System.out.println(number + " 不存在");
    }

    //1.我要干嘛？  判断数组中的某一个数是否存在
    //2.我干这件事情，需要什么才能完成？  需要数组
    //3.调用处是否需要继续使用结果？  返回  true false
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        //什么时候才能断定录入的数字在数组中是否存在的？
        //当数组里面所有的数据全部比较完毕之后，才能断定
        return false;
    }
}

//return和break关键字的区别
//return：其实跟循环没有什么关系，跟方法有关的，表示1结束方法2返回结果
//如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束了。

//break关键字
//其实跟方法没有什么关系，结束循环或者switch的，