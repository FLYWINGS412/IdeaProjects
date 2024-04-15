package com.jidi.oopextends.a10oopextendsdemo10;

// 1.类名见名知意
public class Employee {
    // 2.所有的成员变量都需要私有
    private String id;
    private String name;
    private double salary;

    // 3.构造方法（空参带全部参数的构造）
    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 4.get/set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 5.工作行为
    public void work() {
        System.out.println("员工在工作");
    }

    public void eat() {
        System.out.println("吃米饭");
    }
}
