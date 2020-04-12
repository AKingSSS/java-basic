package handwrite.arraylist;

import java.io.*;
import java.util.ArrayList;

/**
 * @ClassName SerTest02
 * @Description
 * @Author yangkang
 * @Date 2020/4/11 15:45
 * @Version 1.0
 **/
public class SerTest02 {
    /**
     * 需求：
     * 已知 4 个学生对象，要求将 4 个学生对象序列化到当前模块根路径下的stu.txt中
     * 序列化成功后，请通过反序列化将文件中数据读取出来，且打印到控制台
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("Python 大星",18);
        Student s2 = new Student("Python 小星",18);
        Student s3 = new Student("Python 胖虎",18);
        Student s4 = new Student("Python 章鱼博士",18);

        // 创建ArrayList
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./obj.txt"));
        // 调用对象操作流写对象的方法，将对象的数据写到文件
        oos.writeObject(list);
        oos.close();

        // 创建对象操作流--》反序列化（将数据从文件中读取出来）
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./obj.txt"));
        ArrayList<Student> list1 = (ArrayList<Student>) ois.readObject();
        // 关闭流
        ois.close();
        for (Student s: list1) {
            System.out.println(s);
        }
    }
}
