package com.jidi.extendsdemo.a03oopextendsdemo3;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Zi z = new Zi();

        // 把对象的地址值z以16进制的形式打在控制台上
        // System.out.println(Long.toHexString(VM.current().addressOf(z)));

        // 因为内存分析工具需要程序不停止
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
