package handwrite.arraylist;

/**
 * @ClassName Teacher
 * @Description 测试克隆
 * @Author yangkang
 * @Date 2020/4/11 16:09
 * @Version 1.0
 **/
public class Teacher implements Cloneable{
    private String name;
    private String course;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
