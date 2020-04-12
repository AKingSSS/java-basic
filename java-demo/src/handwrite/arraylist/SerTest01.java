package handwrite.arraylist;

import java.io.*;

/**
 * @ClassName SerTest01
 * @Description
 * @Author yangkang
 * @Date 2020/4/11 15:31
 * @Version 1.0
 **/
public class SerTest01 {

    private static void writeObject() throws IOException {
        // 创建对象操作流 --》序列化（将对象的数据写到文件中）
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./obj.txt"));
        // 创建学生对象
        Student s = new Student("Python大星",18);
        // 调用对象操作流写对象的方法，将对象的数据写到文件
        oos.writeObject(s);
        // 关闭流
        oos.close();
    }

    private static void readObject() throws IOException, ClassNotFoundException {
        // 创建对象操作流--》反序列化（将数据从文件中读取出来）
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./obj.txt"));
        Student s = (Student) ois.readObject();
        // 关闭流
        ois.close();
        System.out.println(s);
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 不序列化的话会报错
         */
        // 调用写数据的方法
        writeObject();
        // 调用读数据的方法
        readObject();
    }
}
