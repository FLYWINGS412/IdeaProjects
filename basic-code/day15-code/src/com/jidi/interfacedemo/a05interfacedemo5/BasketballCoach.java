package com.jidi.interfacedemo.a05interfacedemo5;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teacher() {
        System.out.println("篮球教练在教打篮球");
    }
}
