package com.jidi.test6;

public class PhoneTest {
    public static void main(String[] args) {
        // 1.创建一个数组
        Phone[] arr = new Phone[3];

        // 2.创建手机的对象
        Phone p1 = new Phone("小米", 1999, "白色");
        Phone p2 = new Phone("华为", 4999, "蓝色");
        Phone p3 = new Phone("魅族", 3999, "红色");

        // 3.把手机对象添加到数组当中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        // 4.获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // i 索引     arr[i] 元素素（手机对象）
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        // 5.求平均值
        // int avg1 = sum / arr.length;      // 数据能不写死，尽量不写死
        double avg2 = sum * 1.0 / arr.length;      // 平均值有小数
        System.out.println("手机的平均价格为：" + avg2);
    }
}
