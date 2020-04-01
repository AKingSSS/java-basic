package _0401_java8._06maohao;

import _0327_interface.Football;
import _0327_interface.Sports;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @ClassName YinHaoDemo
 * @Description 双引号
 * 类名::方法名
 * @Author yangkang
 * @Date 2020/4/1 10:18
 * @Version 1.0
 **/
public class MaoHaoDemo {
    public void say() {
        System.out.println("Python大星");
    }

    public static void main(String[] args) {
        Consumer<MaoHaoDemo> say = MaoHaoDemo::say;
        System.out.println(say);
    }
}
