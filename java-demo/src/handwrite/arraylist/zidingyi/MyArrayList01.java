package handwrite.arraylist.zidingyi;

/**
 * @ClassName MyArrayList01
 * @Description 构造器 + 变量（常量）
 * @Author yangkang
 * @Date 2020/4/12 8:02
 * @Version 1.0
 **/
public class MyArrayList01<E> {
    /**
     * 实际储存元素
     */
    private Object[] elementData;
    /**
     * 数组长度
     */
    private int size;
    /**
     * 默认第一次扩容容量
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * 定义空数组，用于记录集合的容量
     */
    private static final Object[] EMPTY_ELEMENTDATA = {};
    /**
     * 定义默认扩容数组，方便在校验扩容和自动扩容时做区分，是无参还是有参构造器，方便计算扩容按10，还是自定义
     */
    private static final Object[] DEFAULT_EMPTY_ELEMENTDATA = {};
    /**
     * 无参构造器
     */
    public MyArrayList01() {
        // 初始化
        this.elementData = DEFAULT_EMPTY_ELEMENTDATA;
    }
    /**
     * 有参构造器
     */
    public MyArrayList01(int initialCapacity) {
        if (initialCapacity > 0) {
            // 自定义数组长度
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            // 初始化空数组
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }
}
