package basic._0319_chengxukongzhi;

/**
 * @ClassName DoWhileDemo
 * @Description do...while循环使用
 * @Author Python大星
 * @Date 2020/3/19 16:12
 * @Version 1.0
 **/
public class DoWhileDemo {
    public static void main(String[] args) {
        int x=1;
        do {
            System.out.println("你今年" + x + "岁啦！");
            x++;
        }while(x<=10);
    }
}
