package com.jidi.a03staticdemo3;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String genger) {
        this.name = name;
        this.age = age;
        this.gender = genger;
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

    public String getGenger() {
        return gender;
    }

    public void setGenger(String genger) {
        this.gender = genger;
    }
}
