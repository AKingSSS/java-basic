package demo;

/**
 * @ClassName HelloServiceImpl
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 18:12
 * @Version 1.0
 **/
public class HelloServiceImpl implements HelloService {
    /**
     * 打印hello world
     */
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
