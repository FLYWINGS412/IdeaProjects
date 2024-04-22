package com.jidi.interfacedemo.a09interfacedemo9;

public class InterImpl extends InterAdapter{
    // 我需要用到那个方法，京就重写哪个方法就可以了

    @Override
    public void method5(){
        System.out.println("只用Inter接口中的method5方法");
    }
}
