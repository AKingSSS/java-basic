package basic._0328_reflect;

import basic._0328_reflect.constructor.Person;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/3/29 0:01
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Class personClass = Person.class;
        String className = personClass.getName();
        System.out.println(className);
    }
}
