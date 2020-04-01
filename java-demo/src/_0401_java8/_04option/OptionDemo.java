package _0401_java8._04option;

import java.util.Optional;

/**
 * @ClassName OptionDemo
 * @Description 空指针处理的一种方式
 * @Author yangkang
 * @Date 2020/4/1 9:51
 * @Version 1.0
 **/
public class OptionDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        this.name = Optional.ofNullable(name)
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
