package _0328_reflect.field;


import java.lang.reflect.Field;

/**
 * @ClassName Test2
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 12:44
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 获取 person class 对象
        Class personClass = Person.class;

        // Field[] getFields() 获取所有的成员变量，不考虑修饰符
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // Field getDeclaredField(String name)
        // private String d;
        Field d = personClass.getDeclaredField("d");
        System.out.println(d);

        Person person = new Person();

        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object obj = d.get(person);
        System.out.println(obj);

        d.set(person, "Python小星");
        System.out.println(person.getD());
    }
}
