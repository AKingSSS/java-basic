package handwrite.zidingyi;

import java.util.LinkedList;

/**
 * @ClassName MyLinkedList
 * @Description
 * @Author yangkang
 * @Date 2020/4/14 22:45
 * @Version 1.0
 **/
public class MyLinkedList<E> {
    /**
     * 长度
     */
    int size = 0;
    /**
     * 下一个节点
     */
    private Node<E> next;
    /**
     * 上一个节点
     */
    private Node<E> prev;

    /**
     * 首节点
     */
    Node<E> first;

    /**
     * 尾节点
     */
    Node<E> last;

    /**
     * 无参构造器
     */
    public MyLinkedList() {

    }

    /**
     * 静态内部类
     * @param <E>
     */
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * 增加一个元素
     * @param e
     * @return
     */
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    /**
     * 尾节点插入元素
     * @param e
     */
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    /**
     * 首节点插入元素
     * @param e
     */
    void linkFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        }
        else {
            f.prev = newNode;
        }
        size++;
    }

}
