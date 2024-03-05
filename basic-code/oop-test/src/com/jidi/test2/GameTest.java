//练习题目：文字版格斗游戏的扩展

package com.jidi.test2;

public class GameTest {
    public static void main(String[] args) {
        // 1.创建第一个角色
        Role r1 = new Role("乔峰", 100, '男');

        // 2.创建第一个角色
        Role r2 = new Role("王语嫣", 100, '女');

        // 3.展示角色信息
        r1.showRoleInfo();
        System.out.println();
        r2.showRoleInfo();
        System.out.println();

        // 4.开始格斗回合制游戏
        while (true) {
            // r1开始攻击r2
            r1.attack(r2);
            // 判断r2的剩余血量
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + " K.O " + r2.getName());
                break;
            }

            // r2开始攻击r1
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + " K.O " + r1.getName());
                break;
            }
        }
    }
}