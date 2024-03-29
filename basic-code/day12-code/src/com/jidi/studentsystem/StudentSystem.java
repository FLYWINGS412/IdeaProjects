// 练习题目：学生管理系统

package com.jidi.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {     // 标识loop循环
            // 1.打印菜单
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1： 添加学生");
            System.out.println("2： 删除学生");
            System.out.println("3： 修改学生");
            System.out.println("4： 查询学生");
            System.out.println("5： 退出系统");
            System.out.println();
            System.out.print("请输入你的选择：");

            // 2.键盘录入菜单选择
            String choose = sc.next();

            // 3.菜单选择
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("谢谢使用，再见！");
                    // break loop;            // 方式一：退出loop循环
                    System.exit(0);     // 方式二：停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    // 添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);

        // 键盘输入学生信息
        System.out.print("请输入学生的id：");
        String id = null;
        while (true) {
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                // 表示id已经存在，需要重新录入
                System.out.println("当前id已经存在，请重新输入");
            } else {
                break;
            }
        }

        System.out.print("请输入学生的姓名：");
        String name = sc.next();

        System.out.print("请输入学生的年龄：");
        int age = sc.nextInt();

        System.out.print("请输入学生的家庭住址：");
        String address = sc.next();

        // 添加元素到对象
        Student stu = new Student(id, name, age, address);

        // 学生对象到添加集合
        list.add(stu);
        System.out.println("学生信息添加成功");     // 提示信息
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的学生id：");
        String id = sc.next();

        // id存在就删除
        int index = getIndex(list, id);

        // 对index进行判断
        // 如果-1，就表示不存在，结束方法，回到初始菜单
        if (index >= 0) {
            // 如果大于等于o的，表示存在，直接删除
            list.remove(index);
            System.out.println("id为：" + id + "的学生信息删除成功");

        } else {
            // id不存在，提示id不存在，并回到初始菜单
            System.out.println("id为" + id + "不存在，删除失败");
        }
    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的学生id：");
        String id = sc.next();

        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("id为" + id + "不存在，请重新输入");
            return;     // 如果id不存在，直接返回，不继续执行修改操作
        }

        // 当代码执行到这里，表示什么？表示当前id是存在的。
        // 获取要修改的学生对象
        Student stu = list.get(index);

        // 键盘输入要修改的学生信息
        System.out.print("请输入要修改的学生姓名：");
        String newName = sc.next();

        System.out.print("请输入要修改的学生年龄：");
        int newAge = sc.nextInt();

        System.out.print("请输入要修改的学生家庭地址：");
        String newAddress = sc.next();

        // 修改对象的元素
        stu.setName(newName);
        stu.setAge(newAge);
        stu.setAddress(newAddress);
        System.out.println("学生信息修改成功");
    }

    // 查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;     // 结束方法
        }

        // 打印表头信息
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");

        // 当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getAddress());
        }
    }

    // 判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    // 通过id获取索引
    public static int getIndex(ArrayList<Student> list, String id) {
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 得到每一个学生对象
            Student stu = list.get(i);

            // 查询id是否存在集合中
            if (stu.getId().equals(id)) {

                // 如果存在，返回集合索引
                return i;
            }
        }
        // 当循环结束之后还没有找到，就表示不存在，返回-1
        return -1;
    }
}