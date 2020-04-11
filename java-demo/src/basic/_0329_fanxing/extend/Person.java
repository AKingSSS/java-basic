package basic._0329_fanxing.extend;

/**
 * @ClassName Person
 * @Description
 * @Author yangkang
 * @Date 2020/3/29 16:21
 * @Version 1.0
 **/
public class Person<T> {
    private T item;

    public Person(T t) {
        this.item = t;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }



    public static void main(String[] args) {
        Person<? extends Father> person = new Person<>(new Son());
       Father father = person.get();
//        person.set(new Son()); // ERROR 编译错误
    }
}
