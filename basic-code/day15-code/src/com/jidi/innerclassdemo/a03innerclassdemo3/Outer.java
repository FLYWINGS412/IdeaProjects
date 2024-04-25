package com.jidi.innerclassdemo.a03innerclassdemo3;

public class Outer {
    private int a = 10;

    class inner{
        private int a = 20;

        public void show(){
            int a = 30;

            // outer.this获取了外部类对象的地址值
            System.out.println(Outer.this.a);      // 10 打印外部类变量a（重名变量）
            System.out.println(this.a);         // 20 打印内部类变量a（重名变量）
            System.out.println(a);              // 30 打印本方法变量a（重名变量）
        }
    }
}
