// 练习题目：评委打分

package com.jidi.test2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 在唱歌比赛中，有6名评委给选手打分，分数范围是[0－100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

        // 分析：
        // 1.定义一个数组，用来存储6名评委的打分（0~100）
        int[] scoresArr = getScore();
        System.out.println("评委打分依次为：");
        for (int i = 0; i < scoresArr.length; i++) {
            System.out.print(scoresArr[i] + "分  ");
        }

        // 2.求出数组中的最大值
        int max = getMax(scoresArr);
        System.out.println();
        System.out.println("最高评分为: " + max);


        // 3.求出数组中的最小值
        int min = getMin(scoresArr);
        System.out.println("最底评分为: " + min);


        // 4.求出数组中6个分数的总和
        int sum = getSum(scoresArr);
        System.out.println("总分为： " + sum);


        // 5.（总和 - 最大值 - 最小值）/ 4
        int avg = (sum - max - min) / (scoresArr.length - 2);

        // 6.打印结果
        System.out.println("选手的最终得分为：" + avg);
    }


    // 1.我要干嘛？      定义一个数组，用来存储6名评委的打分（0~100）
    // 2.我需要什么？     都不需要
    // 3.干完了这件事情，是否需要返回？    必须返回
    public static int[] getScore() {
        //定义数组
        int[] scores = new int[6];

        //使用键盘录入的形式，输入分数：0~100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，请重新输入");
            }
        }
        return scores;
    }

    public static int getMax(int[] scoresArr) {
        //求最高评分
        int max = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] > max) {
                max = scoresArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoresArr) {
        //求最底评分
        int min = scoresArr[0];
        for (int i = 1; i < scoresArr.length; i++) {
            if (scoresArr[i] < min) {
                min = scoresArr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scoresArr) {
        //求得分总和
        int sum = 0;
        for (int i = 0; i < scoresArr.length; i++) {
            sum = sum + scoresArr[i];
        }
        return sum;
    }
}
