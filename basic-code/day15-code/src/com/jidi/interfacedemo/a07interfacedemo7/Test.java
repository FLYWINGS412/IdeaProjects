// 练习题目：static修饰在接口中定义静态方法

/*
接口中静态方法的定义格式：
格式：public static返回值类型方法名（参数列表）{
范例：public static void show（）{

接口中静态方法的注意事项：
静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
public可以省略，static不能省略
 */

package com.jidi.interfacedemo.a07interfacedemo7;

public class Test {
    public static void main(String[] args) {
        // 调用接口中的静态方法
        Inter.show();

        // 调用实现类中的静态方法
        InterImpl.show();
    }
}
