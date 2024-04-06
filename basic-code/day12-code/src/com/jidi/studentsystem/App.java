// 练习题目：学生管理员系统的登陆、注册和忘记密码功能。

package com.jidi.studentsystem;

import java.util.ArrayList;
import java.util.Random;
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
        // 1.键盘输入用户名
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入用户名：");
            String username = sc.next();

            // 2.验证用户名是否已注册
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "未注册，请先注册再登陆");
                return;
            }

            // 2.键盘输入密码
            System.out.print("请输入密码：");
            String password = sc.next();

            // 3.验证验证码
            while (true) {
                String rightCode = getCode();
                System.out.println("当前验证码为：" + rightCode);
                System.out.print("请输入验证码：");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入");
                    continue;
                }
            }

            // 4.验证用户名和密码是否正确
            // 集合中是否包含用户名和密码
            // 定义一个方法验证用户名和密码是否正确
            User userInfo = new User(username, password, null, null);       // 封装思想的应用：我们可以把一些零散的数据，封装成一个对象工
            boolean result = checkUserInfo(list, userInfo);      // 以后传递参数的时候，只要传递一个整体就可以了，不需要管这些零散的数据。
            if (result) {
                System.out.println("登陆成功，可以开始使用学生管理系统了");
                // 创建对象调用方法，启动学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("登陆失败，用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前帐号" + username + "被锁定，请联系管理员");
                    // 当前账号锁定之后，直接结束方法即可
                    return;
                } else {
                    System.out.println("当前还剩下" + (2 - i) + "次机会");
                }
            }
        }
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
        // 1.键盘输入用户名
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = sc.next();

        // 验证用户名
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("用户名：" + username + "未注册，请先注册");
            return;
        }

        while (true) {
            // 2.键盘输入身份证号码和手机号码
            System.out.print("请输入身份证号码：");
            String personID = sc.next();

            System.out.print("请输入手机号码：");
            String phoneNumber = sc.next();

            // 3.需要把用户对象通过索引先获取出来。
            int index = findIndex(list, username);
            User user = list.get(index);

            // 4.比较用户对象中的手机号码和身份证号码是否相同
            if (!(user.getPersonID().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(phoneNumber))) {
                System.out.println("身份证号码或手机号码输入有误，不能修改密码");
                return;
            }

            // 当代码执行到这里，表示所有的数据全部验证成功，直接修改即可
            // 5.输入新的密码
            String password;
            while (true) {
                System.out.print("请输入新的密码：");
                password = sc.next();

                System.out.print("请再次输入新的密码：");
                String againPassword = sc.next();

                if (password.equals(againPassword)) {
                    user.setPassword(password);
                    System.out.println("两次密码输入一致");
                    break;
                } else {
                    System.out.println("两次输入的密码不一致，请重新输入");
                    continue;
                }
            }

            // 6.修改密码
            user.setPassword(password);
            System.out.println("密码修改成功");
        }
    }

    private static void printList(ArrayList<User> list) {
        System.out.println("用户名" + "\t\t\t" + "密码" + "\t\t\t\t" + "身份证" + "\t\t\t\t\t" + "手机号");
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername()
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

        // 3.继续校验：但是不能是纯数字
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
            String rightUsername = user.getUsername();
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

    private static String getCode() {
        // 1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();

        // 2.添加所有的大写和小写字母到集合
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        // 3.随机抽取4个字符
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            // 获取随机索引
            int index = r.nextInt(list.size());
            // 利用随机索引获取字符
            char c = list.get(index);
            // 把随机字符添加到StringBuilder
            sb.append(c);
        }

        // 3.把一个随机数字添加到末位
        int number = r.nextInt(10);
        sb.append(number);

        // 4.如果我们要修改字符串中的内容
        // 先把字符串变成字符数组，在数组中修改，务然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        // 拿着最后一个索引，跟随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        // 最大索引指向的元素跟随机索引指向的元素交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);
    }

    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        // 遍历集合，判断用户是否存在，如果存在登录成功，如果不存在登录失败
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }
}


//开发细节：先验证格式是否正确，再验证是否唯一
//因为在以后所有的数据，都是存在数据库中，如果我们要校验，需要使用到网络资源。