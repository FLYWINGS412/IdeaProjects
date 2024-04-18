package com.jidi.oopextendsdemo.a05oopextendsdemo5;

public class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡";

    public void show() {
        //如何打印Zi
        System.out.println(name);           // Zi
        System.out.println(this.name);

        //如何打印Fu
        System.out.println(super.name);     // Fu

        //如何打印喝茶
        System.out.println(hobby);          // 喝茶
        System.out.println(this.hobby);
        System.out.println(super.hobby);

        //如何打印吃鸡
        System.out.println(game);           // 吃鸡
        System.out.println(this.game);
    }
}
