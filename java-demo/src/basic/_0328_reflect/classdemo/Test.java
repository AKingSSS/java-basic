package basic._0328_reflect.classdemo;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 11:29
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * 方式一：Class.forName("全类名");
         * 加载类并对类进行初始化。
         */
        Class cls1 = Class.forName("basic._0328_reflect.classdemo.Student");
        System.out.println("cls1 = " + cls1);
        System.out.println("cls1 = " + cls1);

        //
        /**
         * 方式二：类名.class
         * JVM 使用类 O 的加载器将类 O 装入内存，但不进行初始化，返回类 A 的 Class 对象。
         */
        Class cls2 = Student.class;
        System.out.println("cls2 = " + cls2);

        /**
         * 方式三：对象.getClass();
         * 这时返回的是 b 真正指向的对象的类的 Class 对象。
         */
        Student student = new Student();
        Class cls3 = student.getClass();
        System.out.println("cls3 = " + cls3);

    }
}
