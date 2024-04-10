// 练习题目：static注意事项

/*  总结：
    静态方法中没有this关键字
    静态方法中，只能访问静态。
    非静态方法可以访问所有。 */

package com.jidi.a04staticdemo4;

public class Student {
    static String teacherName;
    String name;
    int age;

    // this：表示当前方法调用者的地址值。
    // 这个this：是由虚拟机赋值的。
    public void show1() {
        System.out.println("this地址值：" + this);
        System.out.println(this.name + ", " + this.age + ", " + this.teacherName);

        // 调用其他方法
        this.show2();
        this.method();
    }

    public void show2(){
        System.out.println("show2");
    }

    public static void method() {
        System.out.println("静态方法");
    }
}