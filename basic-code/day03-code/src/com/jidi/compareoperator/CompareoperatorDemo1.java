package com.jidi.compareoperator;

public class CompareoperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 20;

        //==判断左右两边是否相等
        System.out.println("a等于b吗：" + (a == b));//true
        System.out.println("a等于c吗：" + (a == c));//false

        //!=判断左右两边是否不相等
        System.out.println("a不等于b吗：" + (a != b));//false
        System.out.println("a不等于c吗：" + (a != c));//true
    }
}
