package com.jidi.innerclassdemo.a02innerclassdemo2;

public class Outer {
    String name;

    private class inner{

    }

    public inner getInstance(){
        return new inner();
    }
}
