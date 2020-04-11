package basic._0319_chengxukongzhi;
import java.util.Scanner;

/**
 * @ClassName fenzhi3
 * @Description 分支结构
 * @Author Python大星
 * @Date 2020/3/19 10:14
 * @Version 1.0
 **/
public class fenzhi3 {
    public static void main(String[] args) {
        /*
        if(条件表达式) {
            执行的代码块;
        } else if(条件表达式){
            执行的代码块;
        }…(此处省略N个else if)
        else {
            执行代码块;
        }
         */
        //System.in代表标准输入(即键盘输入)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("对不起，你是未成年人，不能在网吧上网！");
        } else if (age == 18){
            System.out.println("高考毕业完，去考个驾照吧！");
        } else if (age > 18 && age < 22) {
            System.out.println("大学期间，谈个恋爱吧！");
        } else {
            System.out.println("毕业后，迎娶白富美，走上人生巅峰");
        }
    }
}
