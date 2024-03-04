//练习题目：女朋友（测试类)

package com.jidi.test3;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(18);
        gf1.setGender("萌妹子");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());


        //行为
        gf1.eat();
        gf1.sleep();
    }
}
