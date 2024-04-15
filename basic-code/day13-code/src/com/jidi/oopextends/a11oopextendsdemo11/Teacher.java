package com.jidi.oopextends.a11oopextendsdemo11;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 正在 " + getWork());
    }
}
