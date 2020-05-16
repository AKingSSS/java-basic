package java8.lambda;

/**
 * @ClassName Lambda01
 * @Description (params) -> expression
 * <p>
 * (params) -> {statements;}
 * <p>
 * 使用 -> 分割 Lambda 参数和处理语句。
 * <p>
 * 类型可选，可以不指定参数类型，编译器可以自动判断。
 * <p>
 * 圆括号可选，如果只有一个参数，可以不需要圆括号，多个参数必须要圆括号。
 * <p>
 * 花括号可选，一个语句可以不用花括号，多个语句则花括号必须。
 * <p>
 * 返回值可选，如果只有一个表达式，可以自动返回，不需要 return 语句；花括号中需要 return 语法。
 * <p>
 * Lambda 中引用的外部变量必须为 final 类型，内部声明的变量不可修改，内部声明的变量名称不能与外部变量名相同。
 * @Author yk
 * @Date 2020/5/15 14:23
 * @Version 1.0
 **/
public class Lambda09 {
    public static void main(String[] args) {
        // 老的 lambda 方式
        MyInterface inf1 = (a, b) -> a + b;
        // 通过引入静态方法的方式使用
        MyInterface inf2 = (a, b) -> count(a,b);
        // 通过类名调用（后期讲双冒号的用法，先了解下）
        MyInterface inf3 = Lambda09::count;
        System.out.println(inf1.count(500, 20));
        System.out.println(inf2.count(1300, 14));
        System.out.println(inf3.count(600, 66));
    }

    interface MyInterface {
        int count(int a, int b);
    }

    public static int count(int a, int b) {
        return a + b;
    }
}
