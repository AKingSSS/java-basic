package _0321_exception;

/**
 * @ClassName MyException
 * @Description
 * @Author yangkang
 * @Date 2020/3/21 23:40
 * @Version 1.0
 **/
public class MyException extends Exception {
    public MyException() {}
    public MyException(String msg) {
        super(msg);
    }
}
