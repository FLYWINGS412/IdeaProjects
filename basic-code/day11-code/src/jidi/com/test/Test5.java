// 题目：添加学生对象并遍历
// 需求：定义一个集合，添加一些学生对象，并进行遍历
// 学生类的属性为：姓名，年龄。
// 要求：对象的数据来自键盘录入

package jidi.com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();    // 长度为0

        // 2.创建学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.print("请输入学生的姓名：");
            String name = sc.next();
            System.out.print("请输入学生的年龄：");
            int age = sc.nextInt();

            // 把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            // 添加元素
            list.add(s);
        }

        // 3.遍历元素
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
