package _0328_reflect.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 23:56
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class personClass = Person.class;

        //获取指定名称的方法
        Method eat_method1 = personClass.getMethod("eat");
        //执行方法
        Person person = new Person();
        Object rtValue = eat_method1.invoke(person);//如果方法有返回值类型可以获取到，没有就为null
        //输出返回值 eat方法没有返回值，故输出null
        System.out.println("rtValue = " + rtValue);

        System.out.println("--------------------------------------------");

        //获取有参的构造函数  有两个参数 第一个方法名 第二个参数列表 ，不同的参数是不同的方法（重载）
        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(person,"饭");

        System.out.println("============================================");

        //获取方法列表
        Method[] methods = personClass.getMethods();
        for(Method method : methods){     //注意：获取到的方法名称不仅仅是我们在Person类内看到的方法
            System.out.println(method);   //继承下来的方法也会被获取到（当然前提是public修饰的）
        }
    }
}
