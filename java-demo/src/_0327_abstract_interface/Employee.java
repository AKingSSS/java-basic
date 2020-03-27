package _0327_abstract_interface;

/**
 * @ClassName Employee
 * @Description
 * @Author yangkang
 * @Date 2020/3/27 17:45
 * @Version 1.0
 **/
public abstract class Employee {
    /**
     * 1. 抽象类不能被实例化 (初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
     *
     * 2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
     *
     * 3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
     *
     * 4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
     *
     * 5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
     */
    private String name;
    private String address;
    private int number;

    public abstract double computePay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
