package basic._0325_fengzhuang;

/**
 * @ClassName Person
 * @Description
 * @Author yangkang
 * @Date 2020/3/26 11:03
 * @Version 1.0
 **/
public class PersonNew {
    private String name;
    private String age; // 修改 int 为 String

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 150) {
            System.out.println("ERROR：error age input....");// 提示错误信息
        } else {
            this.age = String.valueOf(age); // 修改
        }
    }
}
