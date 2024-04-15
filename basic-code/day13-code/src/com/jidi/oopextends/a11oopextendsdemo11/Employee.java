package com.jidi.oopextends.a11oopextendsdemo11;

public class Employee {
    private String id;
    private String work;

    public Employee() {
    }

    public Employee(String id, String work) {
        this.id = id;
        this.work = work;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void work() {
        System.out.println("员工正在工作");
    }
}
