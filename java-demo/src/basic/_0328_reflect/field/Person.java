package basic._0328_reflect.field;

/**
 * @ClassName Person
 * @Description
 * @Author yangkang
 * @Date 2020/3/28 20:08
 * @Version 1.0
 **/
public class Person {
    /**
     * 最大范围 public
     */
    public String a = "Python大星";
    /**
     * 受保护类型
     */
    protected String b;
    /**
     * 默认的访问权限
     */
    String c;
    /**
     * 私有类型
     */
    private String d;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
