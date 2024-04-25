// 练习题目：写一个Javabean类描述汽车

// 属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限

/*
内部类的访问特点：
内部类可以直接访问外部类的成员，包括私有
外部类要访问内部类的成员，必须创建对象
 */

package com.jidi.innerclassdemo.a01innerclassdemo1;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.carName = "宾利";
        c.carAge = 1;
        c.carColor = "白色";

        c.show();
    }
}
