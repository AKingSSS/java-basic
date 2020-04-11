package basic._0319_chengxukongzhi;

/**
 * @ClassName SwitchTest02
 * @Description
 * @Author Python大星
 * @Date 2020/3/19 14:22
 * @Version 1.0
 **/
public class SwitchTest02 {
    public static void main(String[] args) {
        String str = "123";
        //switch语句实现选择
        switch(str) {
            case "1":
                System.out.println("星期一");
                break;
            case "123":
                System.out.println("星期二");
                break;
            default:
                System.out.println("你输入的数字有误");
                break;
        }
    }

}
