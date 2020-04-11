package basic._0329_fanxing.class_demo;

/**
 * @ClassName Person
 * @Description
 * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 * 在实例化泛型类时，必须指定T的具体类型
 * @Author yangkang
 * @Date 2020/3/29 14:45
 * @Version 1.0
 **/

public class Person<T> {
    /**
     * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
     * 在实例化泛型类时，必须指定T的具体类型
     * key这个成员变量的类型为T,T的类型由外部指定
     */
    private T key;

    public Person(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

    public static void main(String[] args) {
        // 泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
        // 传入的实参类型需与泛型的类型参数类型相同，即为 Integer.
        Person<Integer> personInteger = new Person<Integer>(123456);

        // 传入的实参类型需与泛型的类型参数类型相同，即为 String.
        Person<String> personString = new Person<String>("Python大星");

        System.out.println("泛型测试，key is " + personInteger.getKey());
        System.out.println("泛型测试，key is " + personString.getKey());

//        Person<int> personInt = new Person<int>(123456); // 编译报错
    }
}
