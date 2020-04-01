package _0401_java8._02date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName DateTest
 * @Description JDK8 相比于 JDK7 线程安全，增加新的 API
 * https://www.cnblogs.com/ark-blog/p/9694950.html
 * // ykdo 时间格式化待处理
 * @Author yangkang
 * @Date 2020/4/1 9:31
 * @Version 1.0
 **/
public class DateTest {
    public static void main(String[] args) {
        /**
         * 1、获取当天日期
         * 　Java 8 中的 LocalDate 用于表示当天日期。和 java.util.Date 不同，它只有日期，不包含时间。
         */
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        /**
         * 2、构造指定日期
         */
        LocalDate qxn = LocalDate.of(2000, 1, 1);
        System.out.println("千禧年 = " + qxn);

        /**
         * 3、获取年月日信息
         */
        LocalDate date = LocalDate.now();
        System.out.printf("年 = %d， 月 = %d， 日 = %d",
                date.getYear(), date.getMonthValue(), date.getDayOfMonth());

        /**
         *  4、比较两个日期是否相等
         */
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2018, 9, 24);
        System.out.println("日期是否相等：" + date1.equals(date2));

        /**
         * 时间增量
         */
        LocalTime time = LocalTime.now();
        LocalTime newTime = time.plusHours(2);
        System.out.println("newTime = " + newTime);

        /**
         * 时间增量
         */
        LocalDate date3 = LocalDate.now();
        LocalDate newDate = date3.plus(1, ChronoUnit.WEEKS);
        System.out.println("newDate = " + newDate);

        /**
         * 时间比较
         */
        LocalDate today = LocalDate.now();

        LocalDate date4 = LocalDate.of(2000, 1, 1);
        if (today.isAfter(date4)) {
            System.out.println("千禧年已经过去了");
        }

        LocalDate date5 = LocalDate.of(2222, 1, 1);
        if (today.isBefore(date5)) {
            System.out.println("2222年还未到来");
        }
    }
}
