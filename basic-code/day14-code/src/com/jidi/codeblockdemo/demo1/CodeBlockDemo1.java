// 练习题目：代码块练习

package com.jidi.codeblockdemo.demo1;

public class CodeBlockDemo1 {
    public static void main(String[] args) {
        // 1.局部代码块
        /*
        {
            int a = 10;
        }
        // System.out.println(a);        // 因为当代码执行到这里时，变量a就从内存中消失了
         */


        // 2.构造代码块
        Student s1 = new Student();                         // 空参构造的结果
        System.out.println("-------------");
        Student s2 = new Student("张三",23);      // 有参构造
    }
}
