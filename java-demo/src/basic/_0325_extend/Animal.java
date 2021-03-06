package basic._0325_extend;

/**
 * @ClassName Animal
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 18:10
 * @Version 1.0
 **/
public class Animal {
    private String name;
    private int id;

    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }

    public void eat() {
        System.out.println(name + " 正在吃 ");
    }

    public void sleep() {
        System.out.println(name + " 正在睡 ");
    }

    public void introduction() {
        System.out.println(" 大家好！我是 " + id + " 号 " + name + ".");
    }
}
