package com.jidi.test;

public class Test8 {
    public static void main(String[] args) {
        //汽车无人驾驶会涉及到大量的判断
        //当汽车行驶的时候遇到了红绿灯，就会进行判断
        //如果红灯亮，就停止
        //如果黄灯亮，就减速
        //如果绿灯亮，就行驶

        //1.定义三个变量表示灯的状态
        //true亮  false灭
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        //2.判断
        //红灯亮，就停止
        //黄灯亮，就就减速
        //绿灯亮，就行驶
        if (isLightGreen) {
            System.out.println("gogogo!!!");
        } else if (isLightYellow) {
            System.out.println("slow!!!");
        } else if (isLightRed) {
            System.out.println("stop!!!");
        }
    }
}
