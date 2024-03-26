// 练习题目：添加用户对象并判断是否存在

// 需求：
// 1，main方法中定义一个集合，存入三个用户对象
// 用户属性为：id，username，password

// 要求：定义一个方法，根据id查找对应的用户信息。
// 如果存在，返回索引
// 如果不存在，返回-1

package jidi.com.test;

import jidi.com.test.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<User> list = new ArrayList<>();

        // 2.创建三个用户对象
        User u1 = new User("001", "张三", "123456");
        User u2 = new User("002", "李四", "123456");
        User u3 = new User("003", "王五", "123456");

        // 3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        // 4.键盘输入要查找的用户ID
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要查找的ID：");
        String id = sc.next();

        // 5.调用方法查看id是否存在，并返回集合索引
        int index = getIndex(list, id);
        System.out.println();

        // 6.如果存在，遍历用户信息
        if (index != -1) {
            User user = list.get(index);
            System.out.println("用户ID：" + user.getId());
            System.out.println("用户名：" + user.getUsername());
            System.out.println("密码：" + user.getPassword());
        } else {
            System.out.println("用户ID不存在");
        }
    }

    // 1.我要干嘛？                      根据ID查找集合索引
    // 2.我干这件事需要什么才能完成？        需要集合List和用户ID
    // 3.调用处是否需要使用方法的结果？      需要返回集合索引
    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;  // 找到匹配的ID，返回索引
            }
        }
        return -1;  // 未找到匹配的ID，返回-1
    }
}