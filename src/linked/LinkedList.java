package linked;

import android.support.annotation.NonNull;

import org.w3c.dom.Node;

/**
 * 链表  真正实现动态的数据结构,不需要处理固定容量的问题
 * 缺点：丧失了随机访问的能力，不适合使用索引获取数据
 * Node next
 * E e;
 *
 * @param <E>
 */
public class LinkedList<E> {


    public static void main(String[] a) {

        LinkedList<Integer> list = new LinkedList<>();


        for (int i = 0; i < 5; i++) {
            list.addFirst(i);
        }

        System.out.println(list);

        list.insert(1,66);
        System.out.println(list);

        list.addLast(99);
        System.out.println(list);


        list.deleteLast();
        System.out.println(list);

        list.deleteFist();
        System.out.println(list);

        list.delete(1);

        System.out.println(list);
    }

    @NonNull
    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();

        Node curr = dumpHead;
        for (int i = 0; i < size; i++) {
            if (curr != null) {
                curr = curr.next;

                stringBuffer.append("-->" + curr);

            }
        }
        return stringBuffer.toString();
    }

    Node dumpHead;
    int size;

    public LinkedList() {
        this.dumpHead = new Node(null, null);
        this.size = 0;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 插入到具体位置
     *
     * @param index
     * @param e
     */
    public void insert(int index, E e) {
        if (index < 0 || index > size) {
            throw new RuntimeException("越界了！");
        }
        Node pre = dumpHead;
        int x = 0;
        while (x < index) {
            x++;
            pre = pre.next;
        }

        final Node node = new Node(e);
        node.next = pre.next;
        pre.next = node;
        size++;

    }

    public void addFirst(E e) {
        insert(0, e);
    }

    public void addLast(E e) {
        insert(size, e);

    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("越界了！");
        }
        Node pre = dumpHead;//前一个对象
        for (int x = 0; x < index; x++)
        {
            pre = pre.next;
        }

        final Node node = pre.next;
        pre.next = node.next;
        node.next = null;
        size--;


    }

    public void deleteLast() {
        delete(size-1);
    }

    public void deleteFist() {
        delete(0);
    }

    class Node {

        E e;
        Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node() {
            this.e = null;
            this.next = null;
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

}
