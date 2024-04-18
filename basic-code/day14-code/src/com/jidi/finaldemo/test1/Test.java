// 练习题目：final的使用规则

package com.jidi.finaldemo.test1;

// 1.final修饰变量：叫做常量，只能被赋值一次
/*
public class Test {
    public static void main(String[] args) {
        final int A = 10;           // 变量用final做修饰
        A = 20;                     // 重新给变量赋值时变错
    }
}
 */


// 2.final修饰的方法方法是最终方法，不能被重写
/*
class Fu{
    public final void show(){       // 父类方法用final做修饰
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu{
    @Override
    public void show(){             // 父类方法用final做修饰，所以子类在重写时报错
        System.out.println("子类的show方法");
    }
}
 */


/*
// 3。final修饰类：表明该类是最终类，不能被继承
final class Fu{                // 父类用final做修饰
    public final void show(){
        System.out.println("父类的show方法");
    }
}

class Zi extends Fu{           // 父类用final做修饰后不能再有Zi方法，所以报错
    }
}
 */