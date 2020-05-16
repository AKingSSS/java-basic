package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Lambda01
 * @Description
 * (params) -> expression
 *
 * (params) -> {statements;}
 *
 * 使用 -> 分割 Lambda 参数和处理语句。
 *
 * 类型可选，可以不指定参数类型，编译器可以自动判断。
 *
 * 圆括号可选，如果只有一个参数，可以不需要圆括号，多个参数必须要圆括号。
 *
 * 花括号可选，一个语句可以不用花括号，多个语句则花括号必须。
 *
 * 返回值可选，如果只有一个表达式，可以自动返回，不需要 return 语句；花括号中需要 return 语法。
 *
 * Lambda 中引用的外部变量必须为 final 类型，内部声明的变量不可修改，内部声明的变量名称不能与外部变量名相同。
 * @Author yk
 * @Date 2020/5/15 14:23
 * @Version 1.0
 **/
public class Lambda02 {
    public static void main(String[] args) {
        final MyInterface intf1 = new MyInterface() {
            @Override
            public void f1() {
                System.out.println("==>Java匿名函数类的实现方式");
            }
        };
        intf1.f1();
        MyInterface intf2 = ()->{
          System.out.println("==>Lambda表达式的实现方式");
        };
        intf2.f1();
    }

    interface MyInterface {
        void f1();
    }
}
