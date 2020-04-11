package basic._0329_fanxing.class_demo;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/3/29 15:09
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Python大星");
        Person person2 = new Person(12345);
        Person person3 = new Person(100.00);
        Person person4 = new Person(false);

        System.out.println("泛型测试，key is " + person1.getKey());
        System.out.println("泛型测试，key is " + person2.getKey());
        System.out.println("泛型测试，key is " + person3.getKey());
        System.out.println("泛型测试，key is " + person4.getKey());
    }
}
