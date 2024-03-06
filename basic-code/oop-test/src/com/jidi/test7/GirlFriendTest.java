package com.jidi.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 1.定义数组存入女朋友的对象
        GirlFriend[] arr = new GirlFriend[4];

        // 2.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子", "吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子", "玩游戏");
        GirlFriend gf3 = new GirlFriend("小惠惠", 20, "萌妹子", "看书，学习");
        GirlFriend gf4 = new GirlFriend("小丽丽", 21, "憨妹子", "睡觉");

        // 3.把对象添加到数组当中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        // 4.救和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }

        // 5.计算平均年龄
        int avg = sum / arr.length;
        System.out.println("平均年龄为：" + avg);
        System.out.println();

        // 6.统计年龄比平均值低的有几个，打印他们的信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println("姓名：" + gf.getName());
                System.out.println("年龄：" + gf.getAge());
                System.out.println("性别：" + gf.getGerder());
                System.out.println("爱好：" + gf.getHobby());
                System.out.println();
            }
        }
        System.out.println("小于平均年龄的人数有" + count + "人");
    }
}
