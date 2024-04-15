// 练习题目：带有继承结构的标准Javabean类

/*  1.经理
成员变量：工号，姓名，工资，管理奖金
成员方法：工作(管理其他人)，吃饭(吃米饭)

    2.厨师
成员变量：工号，姓名，工资
成员方法：工作(炒菜)，吃饭(吃米饭) */

package com.jidi.oopextends.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        // 经理成员变量和成员方法
        Manager m = new Manager("001","张三",15000,8000);
        System.out.println(m.getId()+", "+m.getName()+", "+m.getSalary()+", "+m.getBouns());
        m.work();
        m.eat();

        System.out.println("---------------");

        // 厨师成员变量和成员方法
        Cook c = new Cook("002","李四",5000);
        System.out.println(c.getId()+", "+c.getName()+", "+c.getSalary());
        c.work();
        c.eat();
    }
}
