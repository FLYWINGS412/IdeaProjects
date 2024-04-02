package com.jidi.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 1.打印菜单
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1： 登录");
            System.out.println("2： 注册");
            System.out.println("3： 忘记密码");
            System.out.println("4： 退出系统");
            System.out.print("请输入你的选择：");

            // 2.键盘录入菜单选择
            String choose = sc.next();

            // 3.菜单选择
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用，再见！");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void login(ArrayList<User> list) {
        System.out.println("登陆");
    }

    private static void register(ArrayList<User> list) {
        // 用户名，密码，身份证号码，手机号码放到用户对象中
        User u = new User();
        Scanner sc = new Scanner(System.in);

        // 键盘输入用户名、密码、身份证号码、手机号码
        while (true) {
            System.out.print("请输入用户名：");
            String name = sc.next();

            // 验证用户名是否合规
            boolean flag1 = checkUsername(list, name);
            if (flag1) {
                u.setName(name);
                break;
            } else {
                System.out.println("请重新输入用户名");
            }
        }

        // 键盘输入密码
        System.out.print("请输入密码：");
        String password = sc.next();

        // 键盘输入身份证号码
        System.out.print("请输入身份证号码：");
        String personID = sc.next();

        // 键盘输入手机号码
        System.out.print("请输入手机号码：");
        int phoneNumber = sc.nextInt();
    }


    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }

    //用户名唯一
    //用户名长度必须在3~15位之间
    //只能是字母加数字的组合，但是不能是纯数字
    private static void checkUsername(ArrayList<User> list, String username) {

    }
}


//开发细节：先验证格式是否正确，再验证是否唯一
//因为在以后所有的数据，都是存在数据库中，如果我们要校验，需要使用到网络资源。