package com.jidi.a04polyorphismdemo4;

public class Cat extends Animal{
    // 空参构造
    // 带全部参数的构造
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    // eat(String something)(something表示吃的东西)
    // 功能：喂养宠物猫，something表示喂养的东西
    @Override
    public void eat(String something) {
        System.out.println(super.getAge() + "岁的" + super.getColor() + "的猫眯着眼睛侧着头吃" + something);
    }

    // 逮老鼠catchMouse方法(无参数)
    public void catchMouse() {
        System.out.println("猫在逮老鼠");
    }
}
