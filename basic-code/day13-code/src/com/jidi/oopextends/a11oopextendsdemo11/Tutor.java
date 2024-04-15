package com.jidi.oopextends.a11oopextendsdemo11;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 助教正在 " + getWork()+" 同学学习 ");
    }
}
