package com.jidi.interfacedemo.a05interfacedemo5;

public class PingPangSporter extends Sporter implements English{
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习如何打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在学习说英语");
    }
}
