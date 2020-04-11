package basic._0319_chengxukongzhi;

/**
 * @ClassName ForEachDemo
 * @Description foreach 增强for循环
 * @Author Python大星
 * @Date 2020/3/19 15:47
 * @Version 1.0
 **/
public class ForEachDemo {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};

        for ( int x : numbers ) {
            System.out.print( x );
            System.out.print(",");
        }
    }
}
