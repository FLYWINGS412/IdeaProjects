package com.jidi.oopextends.a11oopextendsdemo11;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在开展 " + getWork() + " 工作");
    }
}
