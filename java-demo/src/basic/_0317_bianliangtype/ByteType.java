package basic._0317_bianliangtype;

/**
 *@ClassName ByteType
 *@Description
 *@Author yk
 *@Date 2020/9/21 15:38
 *@Version 1.0
 **/
public class ByteType {
    public static void main(String[] args) {
        /**
         * byte 的取值范围：-128~127
         */
        byte a = (byte) 1000;
        byte b = (byte) (-1000);
        byte c = 126;
        byte d = -126;
        System.out.println(a < 0);
        System.out.println(b > 0);
        System.out.println(c > 0);
        System.out.println(d < 0);

        // 考查
        byte e = (byte)(-129);
        System.out.println((byte)(-129) < 127);
    }
}
