package _0328_reflect.field;


import java.lang.reflect.Field;

/**
 * @ClassName Test2
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 12:44
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 获取 person class 对象
        Class personClass = Person.class;

        // Field[] getFields()获取所有 public 修饰的成员变量
        Field[] fields = personClass.getFields();
        for(Field field : fields){
            System.out.println(field);
        }

        // Field getField(String name)
        Field a = personClass.getField("a");
        System.out.println(a);

        // 获取成员变量 a 的值 【也只有获取共有的，获取私有的或者不存在的字符会抛异常】
        Person person = new Person();
        Object obj = a.get(person);
        System.out.println(obj);

        a.set(person,"Python小星");
        System.out.println(person.a);
    }
}
