package handwrite.arraylist;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description
 * @Author yangkang
 * @Date 2020/4/11 15:30
 * @Version 1.0
 **/
public class Student implements Serializable {
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
