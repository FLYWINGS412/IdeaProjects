//练习题目：匿名内部类

package com.jidi.innerclassdemo.a06innerclassdemo6;

public class Test1 {
    public static void main(String[] args) {
        //编写匿名内部类的代码
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        new Animal(){
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        //在测试类中调用下面的method方法？
        //以前的方式如何调用？
        //要自己写一个子类继承Anima1类
        //再创建子类的对象，传递给method方法

        //方法一：
        //Dog d = new Dog();          //如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦了。
        //method(d);

        //方法二：
        method(                       //使用匿名内部类简化
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    public static void method(Animal a){
        a.eat();
    }
}
