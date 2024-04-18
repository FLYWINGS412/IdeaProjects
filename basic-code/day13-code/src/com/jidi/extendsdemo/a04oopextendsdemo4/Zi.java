package com.jidi.extendsdemo.a04oopextendsdemo4;

public class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        String name = "ziShow";
        System.out.println(name);           // ziShow
        System.out.println(this.name);      // Zi
        System.out.println(super.name);     // Fu
    }
}
