/* 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求2：添加完毕之后，遍历所有学生信息。 */

package com.jidi.test8;

public class Test1 {
    public static void main(String[] args) {
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

        // 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student stu4 = new Student(4, "赵六", 26);

        // 唯一性判断
        // 已存在不用添加
        // 不存在就可以把学生对象添加进数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            // 已存在 --- 不用添加
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {
            // 不存在 --- 就可以把学生对象添加进数组

            // 把stu4添加到数组当中
            // 1.数组已经存满 --- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
            // 2.数组没有存满直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                // 数组已经存满
                // 创建一个新的数组，长度 = 老数组的长度 + 1
                // 然后把老数组的元素，拷贝到新数组当中
                Student[] newArr = creatNewArr(arr);
                // 如果老数组的情况是[stu1,stu2,stu3]
                // 那么新数组的情况是[stu1,stu2,stu3,nul1]
                // 把stu4添加到新数组中
                newArr[count] = stu4;

                // 要求2：添加完毕之后，遍历所有学生信息。
                printArr(newArr);

            } else {
                // 数组没有存满
                // 假设数组的情况是[stu1,stu2,nul1]
                // 那么getCount获取到的是2，表示数组当中已经有了2个元素
                // 还有一层意思：如果下一次要添加数据，就是添加到2索引的位置
                arr[count] = stu4;

                // 要求2：添加完毕之后，遍历所有学生信息。
                printArr(arr);
            }
        }
    }

    // 要求3：通过id删除学生信息，如果存在则删除，如果不存在，则提示删除失败。

    // 1.我要干嘛？      遍历数组
    // 2.我干这件事情，需要什么才能完成？       需要数组
    // 3.调用处是否需要继续使用方法的结果       需要返回遍历
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println("学号：" + stu.getId());
                System.out.println("姓名：" + stu.getName());
                System.out.println("年龄：" + stu.getAge());
            }
            System.out.println();
        }
    }


    // 1.我要干嘛？      创建一个新的数组，长度 = 老数组的长度 + 1，然后把老数组的元素，拷贝到新数组当中
    // 2.我干这件事情，需要什么才能完成？       需要老数组的长度
    // 3.调用处是否需要继续使用方法的结果       需要返回新数组
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];

        // 循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            // 把老数组中的元素添加到新数组当中
            newArr[i] = arr[i];
        }

        // 把新数组返回
        return newArr;
    }

    // 定义一个方法判断数组中已经存了几个元素
    // 1.我要干嘛？      数组是否已存满
    // 2.我干这件事情，需要什么才能完成？       数组
    // 3.调用处是否需要继续使用方法的结果       需要返回
    public static int getCount(Student[] arr) {
        // 定义一个计数器用来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        // 当循环结束之后，我就知道了数组中一共有几个元素
        return count;
    }

    // 1.我要干嘛？      ID唯一性判断
    // 2.我干这件事情，需要什么才能完成？       数组和ID号
    // 3.调用处是否需要继续使用方法的结果       需要返回ID是否已存
    public static boolean contains(Student[] arr, int id) {
        // 依次获取到数组里面的每一个学生对象
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            // 判断stu是否为null
            if (stu != null) {
                // 获取数组中学生对象的id
                int sid = stu.getId();
                // 比较id
                if (sid == id) {
                    return true;
                }
            }
        }

        //当循环结束之后，还没有找到一样的，那么就表示数组中要查找的id是不存在的。
        return false;
    }
}