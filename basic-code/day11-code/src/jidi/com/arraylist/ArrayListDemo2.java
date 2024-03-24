// 练习题目：ArrayList的添、删、改、查、遍历

/*  boolean add(E e)        添加
    boolean remove(E e)     删除
    E remove(int index)
    E set(int index,E e)    修改
    E get(int index)        查询
    int size()              获取长度  */

package jidi.com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 3.删除元素
        boolean result1 = list.remove("aaa");   // 删除"aaa"
        System.out.println(result1);

        boolean result2 = list.remove("ddd");   // 删除"ddd"失败
        System.out.println(result2);

        String str1 = list.remove(2);       // 删除索引"ccc"
        System.out.println(str1);

        // 4.修改元素
        String result3 = list.set(1, "ddd");    // "ccc"修改为"ddd"
        System.out.println(result3);

        // 5.查询元素
        String str2 = list.get(0);      // 查询0索引的元素
        System.out.println(str2);

        // 6.获取长度
        int size = list.size();     // 获取长度为2
        System.out.println(size);

        System.out.println(list);


        // 7.遍历
        for (int i = 0; i < list.size(); i++) {
            //i索引
            //list.get(i)元素
            String str3 = list.get(i);
            System.out.println(str3);
        }
    }
}
