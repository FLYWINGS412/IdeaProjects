/* 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁 */

package com.jidi.test8;

public class Test3 {
    public static void main(String[] args) {
        // 要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁

        // 1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];

        // 2.创建学生对象并添加到数组当中
        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);

        // 3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        // 4.找到id为2的学生对于的索引
        int index = getIndex(arr, 2);

        // 5.判断索引
        if (index >= 0) {
            // 如果存在，则将他的年龄+1岁
            Student stu = arr[index];

            // 把原来的年龄拿出来
            int newAge = stu.getAge() + 1;

            // 把+1之后的年龄传回去
            stu.setAge(newAge);

            // 遍历修改后的学生信息
            printArr(arr);

        } else {
            // 如果不存在，则提示删除失败
            System.out.println("ID不存在，修改年龄失败");
        }
    }

    // 1.我要干嘛？      找到id在数组中的索引
    // 2.我干这件事情，需要什么才能完成？       需要数组和要删除的id
    // 3.调用处是否需要继续使用方法的结果       需要返回id是否存在
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            // 依次得到每一个学生对象
            Student stu = arr[i];
            // 对stu进行一个非空判断
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }

        //当循环结束之后，还没有找到就表示不存在
        return -1;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 依次得到每一个学生对象
            Student stu = arr[i];
            // 对stu进行一个非空判断
            if (stu != null) {
                System.out.println();
                System.out.println("学号：" + stu.getId());
                System.out.println("姓名：" + stu.getName());
                System.out.println("年龄：" + stu.getAge());
            }
        }
    }
}