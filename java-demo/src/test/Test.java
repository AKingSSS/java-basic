package test;

/**
 * @ClassName Test
 * @Description
 * @Author yangkang
 * @Date 2020/4/15 20:01
 * @Version 1.0
 **/
public class Test {
    private static String getLongSonStr(String str){
        if (str == null || str.length() == 0) {
            return "参数为空";
        }
        char[] chars = str.toCharArray();
        int len = chars.length;
        int begin = 0;
        int end = 0;
        char temp;
        for (int i = 0; i < len; i++) {
            if (chars[i] == 'a') {
                begin = i;
                end = i;
                temp = 'a';
            } else if (i - end == 1 && (1==1)) {
                // 判断Unicode值是否是是增加1
                end = i;
            } else {
                begin = i;
            }
        }
        for (int j = begin; j <= end ; j++) {
            System.out.print(chars[j]);
        }

        return "";
    }

    public static void main(String[] args) {
        /**
         * 寻找一个给定字符串的最长连续子序列
         * ababcdefabc->abcdef
         */

    }
}
