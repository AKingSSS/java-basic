package refactoring._01extractmethod;

/**
 * @ClassName ConcreteClass
 * @Description
 * @Author yk
 * @Date 2020/5/13 16:28
 * @Version 1.0
 **/
public class ConcreteClass extends AbstractClass {
    /**
     *
     */
    @Override
    public void learn() {
        System.out.println("60分万岁...");
    }

    /**
     * 自由恋爱
     */
    @Override
    public void love() {
        System.out.println("找对象标准：肤白貌美大长腿...");
    }

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.runLife();
    }
}
