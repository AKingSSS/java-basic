package refactoring._01extractmethod;

/**
 * @ClassName AbstractClass
 * @Description
 * @Author yk
 * @Date 2020/5/13 16:22
 * @Version 1.0
 **/
public abstract class AbstractClass {

    /**
     * 模板方法用来控制子类的顺序 要想有人生必须按老爸的人生顺序来
     * 声明 final不让子类覆盖这个方法，防止改变人生顺序
     */
    public final void  runLife(){
        learn();
        work();
        love();
    }

    /**
     * 学习
     */
    public void learn(){
        System.out.println("每天学习到 12 点，成绩保持班级前三");
    }

    /**
     * 工作
     */
    public void work(){
        System.out.println("进腾讯工作");
    }

    /**
     * 自由恋爱
     */
    public abstract void love();
}
