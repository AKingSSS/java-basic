package basic._0331_string;

/**
 * @ClassName StringDemo2
 * @Description
 * @Author yangkang
 * @Date 2020/3/31 14:57
 * @Version 1.0
 **/
public class StringDemo2 {
    public static void main(String[] args) {
        // 情况1
        String s1 = "abc";
        String s2 = s1;
        System.out.println(s1 == s2);

        // 情况2
        String s3 = "abc";
        String s4 = new String("abc");
        System.out.println(s3 == s4);

        // 情况3
        String s5 = new String("abc");
        String s6 = new String("abc");
        System.out.println(s5 == s6);

        // 情况4
        String s7 = "a";
        String s8 = "b";
        String s9 = s7 + s8;
        String s10 = "ab";
        System.out.println(s9 == s10);

        // 情况5
        String s11 = "a" + "b";
        String s12 = "ab";
        System.out.println(s11 == s12);

        // 情况6
        String s13 = "abc";
        String s14 = new String("abc").intern();
        System.out.println(s13 == s14);
    }
}
