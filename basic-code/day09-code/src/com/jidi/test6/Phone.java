//练习题目：定义数组存储3部手机对象

package com.jidi.test6;

public class Phone {
    private String brand;   // 品牌
    private int price;  // 价格
    private String colour;  // 颜色

    public Phone() {
    }

    public Phone(String brand, int price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
