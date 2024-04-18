package com.jidi.oopextendsdemo.a11oopextendsdemo11;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在 " + getWork());
    }
}
