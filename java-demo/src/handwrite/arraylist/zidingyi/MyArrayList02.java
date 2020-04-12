package handwrite.arraylist.zidingyi;

import java.util.Arrays;

/**
 * @ClassName MyArrayList01
 * @Description add 方法
 * @Author yangkang
 * @Date 2020/4/12 8:02
 * @Version 1.0
 **/
public class MyArrayList02<E> {
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
     * 数组最大长度，减 8 是因为储存这个长度需要 8个字节
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    /**
     * 无参构造器
     */
    public MyArrayList02() {
        // 初始化
        this.elementData = DEFAULT_EMPTY_ELEMENTDATA;
    }

    /**
     * 有参构造器
     */
    public MyArrayList02(int initialCapacity) {
        if (initialCapacity > 0) {
            // 自定义数组长度
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            // 初始化空数组
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    /**
     * 添加元素
     *
     * @param e
     * @return
     */
    public boolean add(E e) {
        // 扩容校验
        ensureCapacityInternal(size + 1);
        // 增加元素
        this.elementData[size++] = e;
        return true;
    }

    /**
     * 扩容校验与自动扩容
     * 考虑两种情况：
     * ① 无参构造
     * ② 有参构造
     *
     * @param minCapacity
     */
    private void ensureCapacityInternal(int minCapacity) {
        // 重新计算minCapacity
        minCapacity = calculateCapacity(elementData, minCapacity);
        // 扩容条件
        if (minCapacity - elementData.length > 0) {
            grow(minCapacity);
        }
    }

    /**
     * 计算 minCapacity，为了判断是否需要扩容
     *
     * @param elementData
     * @param minCapacity
     * @return
     */
    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        // 判断是否按无参构造函数，扩容按默认容量计算
        if (elementData == DEFAULT_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    /**
     * 扩容
     * 旧数组 指向新数组
     * @param minCapacity
     */
    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        // 扩容 1.5 倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        /**
         * ① 无参构造，minCapacity = 10，而 newCapacity = 0
         * ② 比如你使用有参构造，长度为 1
         * minCapacity = 2，而 newCapacity = 1
         */
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    /**
     * 容量最大化
     * @param minCapacity
     * @return
     */
    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    public static void main(String[] args) {
        System.out.println(1 + (1 >> 1));
    }
}
