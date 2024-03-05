package com.jidi.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义一个方法用于攻击别人
    // 思考：谁攻击谁？
    // Role r1 = new Role();
    // Role r2 = new Role();
    // r1.攻击（r2）;
    // 方法的调用者去攻击参数

    public void attack(Role role) {
        // 计算造成的伤害，每次伤害造成1 ~ 20点血
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        // 修改一下挨揍的人的血量
        // 剩余血量
        int remainBlood = getBlood() - hurt;
        // 对剩余血量做一个验证，如果remainBlood的值为负数就修改为0，否则保持remainBlood的值不变。
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // 修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        // this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了"
                + hurt + "点伤害，" + role.getName() + "还剩下了" + remainBlood + "点血。");
    }
}
