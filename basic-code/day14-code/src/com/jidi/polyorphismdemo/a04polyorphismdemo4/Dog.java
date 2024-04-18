package com.jidi.polyorphismdemo.a04polyorphismdemo4;

public class Dog extends Animal {
    // 空参构造
    // 带全部参数的构造
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    // eat(String something)(something表示吃的东西)
    // 功能：喂养宠物狗，something表示喂养的东西
    @Override
    public void eat(String something) {
        System.out.println(super.getAge() + "岁的" + super.getColor() + "的狗两只前腿死死的抱住" + something + "猛吃");
    }

    // 看家lookHome方法(无参数)
    public void lookHome() {
        System.out.println("狗在看家");
    }
}
