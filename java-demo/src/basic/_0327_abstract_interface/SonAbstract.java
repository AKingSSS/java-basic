package basic._0327_abstract_interface;

/**
 * @ClassName SonAbstract
 * @Description
 * @Author yangkang
 * @Date 2020/3/27 17:15
 * @Version 1.0
 **/
public class SonAbstract extends PersonAbstract {
    private String hobby;
    public SonAbstract(String name, int age,String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    @Override
    public void say() {
        System.out.println("我是" + getName() + ";今年" + getAge() + "岁。"
                + "我的爱好是" + getHobby());
    }

    public void play() {
        System.out.println("我的爱好是" + getHobby());
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public static void main(String[] args) {
        PersonAbstract personAbstract =
                new SonAbstract("Python大星",18,"打篮球");
        personAbstract.say();
        personAbstract = (SonAbstract) personAbstract;
        ((SonAbstract) personAbstract).play();
    }
}
