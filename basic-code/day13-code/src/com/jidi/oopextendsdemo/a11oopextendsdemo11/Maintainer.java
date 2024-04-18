package com.jidi.oopextendsdemo.a11oopextendsdemo11;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在开展 " + getWork() + " 工作");
    }
}
