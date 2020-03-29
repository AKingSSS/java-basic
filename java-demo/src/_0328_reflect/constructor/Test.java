package _0328_reflect.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 23:13
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class personClass = Person.class;

        //Constructor<?>[] getConstructors()
        Constructor[] constructors = personClass.getConstructors();
        for(Constructor constructor :constructors)

        {   //Constructor 对象reflect包下的 import java.lang.reflect.Constructor;
            System.out.println(constructor);
        }

        System.out.println("==========================================");

        //获取无参构造函数   注意：Person类中必须要有无参的构造函数，不然抛出异常
        Constructor constructor1 = personClass.getConstructor();
        System.out.println("constructor1 = "+constructor1);
        //获取到构造函数后可以用于创建对象
        Object person1 = constructor1.newInstance();//Constructor类内提供了初始化方法newInstance();方法
        System.out.println("person1 = "+person1);


        System.out.println("==========================================");

        //获取有参的构造函数  //public Person(String name, Integer age) 参数类型顺序要与构造函数内一致，且参数类型为字节码类型
        Constructor constructor2 = personClass.getConstructor(String.class, Integer.class);
        System.out.println("constructor2 = "+constructor2);
        //创建对象
        Object person2 = constructor2.newInstance("张三", 23);   //获取的是有参的构造方法，就必须要给参数
        System.out.println(person2);

        System.out.println("=========================================");

        //对于一般的无参构造函数，我们都不会先获取无参构造器之后在进行初始化。而是直接调用Class类内的newInstance()方法
        Object person3 = personClass.newInstance();
        System.out.println("person3 = "+person3);
        //我们之前使用的 Class.forName("").newInstance; 其本质上就是调用了类内的无参构造函数来完成实例化的
        //故可以得出结论 我们以后在使用  Class.forName("").newInstance; 反射创建对象时，一定要保证类内有无参构造函数
    }
}
