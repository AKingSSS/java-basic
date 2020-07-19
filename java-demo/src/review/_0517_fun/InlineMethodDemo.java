package review._0517_fun;

/**
 * @ClassName InlineMethodDemo
 * @Description 内联函数
 * @Author aking
 * @Date 2020/5/17 21:04
 * @Version 1.0
 **/
public class InlineMethodDemo {
    // 重构前
    public String GetUserInfo(int age) {
        return MoreThanEighteen(age) ? "成年人" : "未成年人";
    }
    public boolean MoreThanEighteen(int age) {
        return age >= 18;
    }
    // 重构后
    public String GetUserInfo2(int age) {
        return (age >= 18) ? "成年人" : "未成年人";
    }

}
