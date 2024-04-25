package com.jidi.innerclassdemo.a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println("汽车品牌：" + carName);
        System.out.println("汽车车龄：" + carAge + "年");
        System.out.println("汽车颜色：" + carColor);

        Engine e = new Engine();
        e.engineName = "蓝天";
        e.engineAge = 1;
        System.out.println("发动机品牌：" + e.engineName);         // 外部类无法直接获取内部类的成员，必须创建对象
        System.out.println("发动机使用年限：" + e.engineAge + "年");
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            System.out.println(carName);        // 内部类可以直接访问外部类的成员，包括私有
        }
    }
}
