package _0328_reflect.method;

/**
 * @ClassName Person
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 23:51
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
     * 有参构造函数
     * @param name
     * @param age
     */
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 无参方法
     */
    public void eat(){
        System.out.println("eat...");
    }

    /**
     * 重载有参方法
     * @param food
     */
    public void eat(String food){
        System.out.println("eat..."+food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
