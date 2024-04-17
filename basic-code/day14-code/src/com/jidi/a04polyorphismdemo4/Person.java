package com.jidi.a04polyorphismdemo4;

public class Person {
    // 属性：姓名，年龄
    private String name;
    private int age;

    // 生成空参有参构造，set和get方法
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    // 饲养狗
    // keepPet(Dog dog,String something)方法
    // 年龄为30岁的老王养了一只黑颜色的2岁的狗
    // 2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    public void keepPet(Dog dog, String something) {
        System.out.println("年龄为" + age + "的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
        dog.eat(something);
    }

    // 饲养猫
    // keepPet(Cat cat, String something)方法
    // 年龄为25岁的老李养了一只灰颜色的3岁的猫
    // 3岁的灰颜色的猫眯着眼睛侧着头吃鱼
    public void keepPet(Cat cat, String something) {
        System.out.println("年龄为" + age + "的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
        cat.eat(something);
    }
    */

    // 想要一个方法，能接收所有的动物，，包括猫，包括狗
    // 方法的形参：可以写这些类的父类Animal
    public void keepPet(Animal a, String something) {
        if(a instanceof Dog d){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的动物");
            a.eat(something);
            d.lookHome();
        }else if (a instanceof Cat c){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的动物");
            a.eat(something);
            c.catchMouse();
        }else {
            System.out.println("没有这种动物");
        }
    }
}
