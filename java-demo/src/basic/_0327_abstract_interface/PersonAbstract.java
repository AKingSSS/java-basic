package basic._0327_abstract_interface;

/**
 * @ClassName PersonAbstract
 * @Description
 * @Author yangkang
 * @Date 2020/3/27 16:47
 * @Version 1.0
 **/
public abstract class PersonAbstract {
    private String name;
    private int age;

    public PersonAbstract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("我是" + getName() + ";今年" + getAge() + "岁");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*    public static void main(String[] args) {

        PersonAbstract personAbstract =
                new PersonAbstract("Python大星","18");
        personAbstract.say();
    }*/
}
