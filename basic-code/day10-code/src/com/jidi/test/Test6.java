/*  给你一个字符串S，由若干单词组成，单词前后用一些空格字符隔开。
    返回字符串中最后一个单词的长度。
    单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

示例：输入：s = "fly me to the moon"   输出：4
    解释：最后一个单词是"moon"，长度为4。 */

package com.jidi.test;

public class Test6 {
    public static void main(String[] args) {
        // 思路：倒着遍历，直到遇到空格为止，遍历的次数就是单词的长度。

        // 1.定义一个字符串
        String str = "fly me to the moon";

        // 2.倒着遍历字符串，直到遇到空格为止，遍历的次数就是单词的长度。
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == ' ') {        // 检查字符是否为空格
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}