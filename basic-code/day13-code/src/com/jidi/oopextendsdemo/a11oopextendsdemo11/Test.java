// 练习题目：带有继承结构的标准Javabean类

/*
在黑马程序员中有很多员工(Employee)。
按照工作内容不同分教研部员工(Teacher)和行政部员工(AdminStaff)
1.教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
2.行政部根据负责事项不同,又分为维护专员(Maintainer),采购专员(Buyer)
3.公司的每一个员工都编号，姓名和其负责的工作
4.每个员工都有工作的功能，但是具体的工作内容又不一样。
*/


package com.jidi.oopextendsdemo.a11oopextendsdemo11;

public class Test {
    public static void main(String[] args) {
        // 讲师
        Lecturer l = new Lecturer("001", "张三", "上课");
        l.work();

        // 助教
        Tutor t = new Tutor("002", "李四", "辅导");
        t.work();

        // 维护专员
        Maintainer m = new Maintainer("003", "王五", "维护");
        m.work();

        // 采购专员
        Buyer b = new Buyer("004","赵六","采购");
        b.work();
    }
}
