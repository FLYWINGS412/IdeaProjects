// 练习题目：编写带有接口和抽象类的标准javabean类
/*
我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
为了出国交流，跟乒乓球相关的人员都需要学习英语。
请用所有知识分析，在这个案例中，哪些是具体类，哪些是抽象类，哪些是接口？

乒乓球运动员：姓名，年龄，学打乒乓球，说英语
篮球运动员：姓名，年龄，学打篮球
乒乓球教练：姓名，年龄，教打乒乓球，说英语
篮球教练：姓名，年龄，教打篮球
 */

package com.jidi.interfacedemo.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        // 创建对象类
        PingPangSporter pps = new PingPangSporter("刘诗雯", 23);

        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();
    }
}
