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
public class Lambda06 {
    public static void main(String[] args) {
        // 参数类型可选
        MyInterface inf0 = (String name, int days) -> {
            System.out.println("hello!" + name + ";遇见你的" + days + "天。");
        };
        // 可以不指定参数类型，编译器可以自动判断。
        MyInterface inf1 = (name, days) -> {
            System.out.println("hello!" + name + ";遇见你的" + days + "天。");
        };
        // 花括号可选，一个语句可以不用花括号
        MyInterface inf2 = (name,days) ->  System.out.println("hello!" + name + ";遇见你的" + days + "天。");
        inf0.say("Python小星",365);
        inf1.say("Python大星",365);
        inf2.say("康师傅",365);
    }

    interface MyInterface {
        void say(String name, int days);
    }
}
