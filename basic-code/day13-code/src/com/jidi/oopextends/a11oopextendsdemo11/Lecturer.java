package com.jidi.oopextends.a11oopextendsdemo11;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println(getName() + " 老师正在 " + getWork());
    }
}
