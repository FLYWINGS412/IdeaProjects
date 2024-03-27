package com.jidi.studentsystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        loop:
        while (true) {     // 标识loop循环
            // 1.打印菜单
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("             1： 添加学生");
            System.out.println("             2： 删除学生");
            System.out.println("             3： 修改学生");
            System.out.println("             4： 查询学生");
            System.out.println("             5： 退出系统");
            System.out.println();
            System.out.print("             请输入你的选择：");

            // 2.键盘录入菜单选择
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            // 3.菜单选择
            switch (choose) {
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> queryStudent();
                case "5" -> {
                    System.out.println("退出系统");
                    // break loop;            // 方式一：退出loop循环
                    System.exit(0);     // 方式二：停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    // 添加学生
    public static void addStudent() {
        System.out.println("添加学生");
    }

    // 删除学生
    public static void deleteStudent() {
        System.out.println("删除学生");
    }

    // 修改学生
    public static void updateStudent() {
        System.out.println("修改学生");
    }

    // 查询学生
    public static void queryStudent() {
        System.out.println("查询学生");
    }
}