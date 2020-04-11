package basic._0319_chengxukongzhi;

import java.util.Scanner;

/**
 * @ClassName SwitchTest01
 * @Description
 * @Author Python大星
 * @Date 2020/3/19 14:22
 * @Version 1.0
 **/
public class SwitchTest01 {
    public static void main(String[] args) {
        //System.in代表标准输入(即键盘输入)
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入一个数字(1-7)：");
        int weekday = sc.nextInt();
        //switch语句实现选择
        switch(weekday) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字有误");
                break;
        }
    }

}
