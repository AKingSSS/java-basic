package _0401_java8._03base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @ClassName Base64Demo
 * @Description
 * @Author yangkang
 * @Date 2020/4/1 9:50
 * @Version 1.0
 **/
public class Base64Demo {
    public static void main(String[] args) {
        String text = "Python大星";
        //编码
        String encode = Base64.getEncoder()
                .encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encode);

        //解码
        String decode = new String(Base64.getDecoder().decode(encode), StandardCharsets.UTF_8);
        System.out.println(decode);
    }
}
