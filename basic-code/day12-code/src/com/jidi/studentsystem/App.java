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
            System.out.println("4： 打印学生信息");
            System.out.println("5： 退出系统");
            System.out.print("请输入你的选择：");

            // 2.键盘录入菜单选择
            String choose = sc.next();

            // 3.菜单选择
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> printList(list);
                case "5" -> {
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
        Scanner sc = new Scanner(System.in);

        // 1.键盘输入用户名
        String username;
        while (true) {
            System.out.print("请输入用户名：");
            username = sc.next();

            // 验证用户名是否合规
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("格式不满足条件，请重新输入用户名");
                continue;
            }

            // 验证用户名是否唯一
            // username到集合中判断是否有存在
            boolean flag2 = contains(list, username);
            if (flag2) {      // 用户名已存在
                System.out.println("用户名" + username + "已存在，请重新输入用户名");
                continue;
            } else {     // 用户名不存在
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        // 2.键盘输入密码
        // 密码键盘输入两次，两次一致才可以进行注册，
        String password;
        while (true) {
            System.out.print("请输入要注册的密码：");
            password = sc.next();

            System.out.print("请再次输入注册密码：");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次密码输入不一致，请重新输入密码");
                continue;
            } else {
                break;
            }
        }

        // 3.键盘输入身份证号码
        String personID;
        while (true) {
            System.out.print("请输入身份证号码：");
            personID = sc.next();
            boolean blag = checkPersonID(personID);
            if (blag) {
                break;
            } else {
                System.out.println("身份证格式有误，请重新输入");
                continue;
            }
        }

        // 4.键盘输入手机号码
        String phoneNumber;
        while (true) {
            System.out.print("请输入手机号码：");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                break;
            } else {
                System.out.println("手机号码输入格式不正确，请重新输入");
                continue;
            }
        }

        // 5.用户名，密码，身份证号码，手机号码放到用户对象中
        User u = new User(username, password, personID, phoneNumber);

        // 6.把用户对象添加到集合中
        list.add(u);
        System.out.println("注册成功");
    }

    private static void forgetPassword(ArrayList<User> list) {
        System.out.println("忘记密码");
    }

    private static void printList(ArrayList<User> list) {
        System.out.println("用户名" + "\t\t\t" + "密码" + "\t\t\t\t" + "身份证" + "\t\t\t\t\t" + "手机号");
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getName()
                    + "\t\t" + user.getPassword()
                    + "\t\t" + user.getPersonID()
                    + "\t\t" + user.getPhoneNumber());
        }
    }

    private static boolean checkUsername(String username) {
        // 1.用户名长度必须在3~15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        // 2.维续校验：只能是字母加数字的组合
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        // 3.维续校验：但是不能是纯数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;  // 如果已有了一个字母则停止遍历
            }
        }
        return count > 0;
    }

    private static boolean contains(ArrayList<User> list, String username) {
        // 循环遍历集合得到每一个用户对象
        // 拿着用户对象中的用户名进行比较
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getName();
            if (username.equals(rightUsername)) {
                return true;
            }
        }

        // 当循环结束了，表示集合里面所有的用户都比较完毕了，还没有一样的，则返回false
        return false;
    }

    private static boolean checkPersonID(String personID) {
        // 长度为18位
        if (personID.length() != 18) {
            return false;
        }

        // 不能以0为开头
        if (personID.startsWith("0")) {
            // 如果以0开头，那么返回false
            return false;
        }

        // 前17位，必须都是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            // 如果有一个字符不在0-9之间，那么直接返回false
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        // 最为一位可以是数字，也可以是大写x或小写x
        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        // 长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }

        // 不能以0为开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }

        // 必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        // 当循环结束之后，表示每一个字符都在0-9之间
        return true;
    }
}


//开发细节：先验证格式是否正确，再验证是否唯一
//因为在以后所有的数据，都是存在数据库中，如果我们要校验，需要使用到网络资源。