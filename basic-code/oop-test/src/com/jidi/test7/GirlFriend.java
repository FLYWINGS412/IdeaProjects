// 定义数组存储4个女朋友的对象

package com.jidi.test7;

public class GirlFriend {
    private String name;    // 姓名
    private int age;    // 年龄
    private String gerder;  // 性别
    private String hobby;   // 爱好

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String gerder, String hobby) {
        this.name = name;
        this.age = age;
        this.gerder = gerder;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGerder() {
        return gerder;
    }

    public void setGerder(String gerder) {
        this.gerder = gerder;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
