package demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyDemo
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 18:11
 * @Version 1.0
 **/
public class ProxyDemo implements InvocationHandler {
    private HelloService helloService;
    public ProxyDemo(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        method.invoke(helloService,args);
        System.out.println("after");
        return null;
    }

    public static void main(String[] args) {
        HelloService hello = new HelloServiceImpl();
        ProxyDemo proxyDemo = new ProxyDemo(hello);

        HelloService h = (HelloService)Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), proxyDemo);
        h.sayHello();

    }
}
