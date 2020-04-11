package basic._0328_reflect.method;

import java.lang.reflect.Method;

/**
 * @ClassName Test2
 * @Description
 * @Author yangkang
 * @Date 2020/3/29 0:00
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) {
        Class personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for(Method method : methods){
            System.out.println(method);
            //获取方法名
            String name = method.getName();
            System.out.println(name);
        }
    }
}
