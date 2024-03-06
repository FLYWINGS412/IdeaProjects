//练习题目：键盘录入的两套体系练习

package com.jidi.test4;

public class Test1 {
    public static void main(String[] args) {
        // 键盘录入：

        // 第一套体系：
        // nextInt()；接收整数
        // nextDouble()；接收小数
        // next()}；接收字符串
        // 第一套体系在遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了

        /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");      // 这里输入123 456，测试第一套体系（空格）是否会被接受
        int num1 = sc.nextInt();
        System.out.println(num1);       // 输出结果为123，而非123 456

        System.out.println("请输入第二个整数");      // 这里默认456，无需要再手动输入
        int num2 = sc.nextInt();
        System.out.println(num2);       // 输出结果为456 */


        /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");           // 这里输入abc def，测试第一套体系（空格）是否会被接受
        String str1 = sc.next();
        System.out.println(str1);       // 输出结果为abc，而非abc def

        System.out.println("请输入第二个字符串");        // 这里默认456，无需要再手动输入
        String str2 = sc.next();
        System.out.println(str2);       // 输出结果为def */


        // 第二套体系：
        // nextLine()；接收字符串
        // 可以接收空格，制表符，遇到回车才停止接受数据

        /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");           // 这里输入abc def，测试第二套体系（空格）是否会被接受
        String line1 = sc.nextLine();
        System.out.println(line1);       // 输出结果为abc def

        System.out.println("请输入第二个字符串");           // 这里输入123 456，测试第二套体系（空格）是否会被接受
        String line2 = sc.nextLine();
        System.out.println(line2);       // 输出结果为123 456 */
    }
}
