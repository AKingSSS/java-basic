package basic._0328_reflect.constructor;

/**
 * @ClassName Person
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 22:23
 * @Version 1.0
 **/
public class Person {
    private String name;
    private Integer age;

    /**
     * 无参构造函数
     */
    public Person() {

    }

    /**
     * 单个参数的构造函数，且为私有构造方法
     * @param name
     */
    private Person(String name){

    }

    /**
     * 有参构造函数
     * @param name
     * @param age
     */
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
