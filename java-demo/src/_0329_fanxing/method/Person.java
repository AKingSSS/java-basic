package _0329_fanxing.method;

import _0328_reflect.classdemo.Student;

/**
 * @ClassName Person
 * @Description
 * @Author yangkang
 * @Date 2020/3/29 15:28
 * @Version 1.0
 **/
public class Person<T> {
    /**
     *
     * @param c 用来创建泛型对象 T
     * @param <T> 声明一个泛型 T
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        // 创建泛型对象
        T t = c.newInstance();
        return t;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Person person = new Person();
        Object obj = person.getObject(Student.class);
        System.out.println(obj);
    }
}
