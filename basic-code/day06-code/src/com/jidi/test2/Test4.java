package com.jidi.test2;

public class Test4 {
    public static void main(String[] args) {
        /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
        要求：兼容全整数类型型（byte,short,int,long）*/
        compare(2,2);
    }

    //会把相同功能的方法名起成一样的名字
    //好处1：定义方法的时候可以不用那么多的单词了
    //好处2：调用方法的时候也不需要那么麻烦了
    public static void compare(byte b1, byte b2) {
        //System.out.println("byte");  //验证执行的是哪一个方法
        System.out.println(b1 == b2);
    }

    public static void compare(short s1, short s2) {
        //System.out.println("short");  //验证执行的是哪一个方法
        System.out.println(s1 == s2);
    }

    public static void compare(int i1, int i2) {
        //System.out.println("int");  //验证执行的是哪一个方法
        System.out.println(i1 == i2);
    }

    public static void compare(long l1, long l2) {
        //System.out.println("long");  //验证执行的是哪一个方法
        System.out.println(l1 == l2);
    }
}
