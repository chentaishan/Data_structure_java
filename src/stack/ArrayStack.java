package stack;


/**
 * 栈：先进后出的数据结构
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {

    int capacity = 10;
    Object[] objects;
    int size=0;

    public ArrayStack() {
        objects = new Object[capacity];
    }

    /*
    * 删除栈顶数据
     */
    @Override
    public void pop() {

        if (isEmpty()){
            return;
        }
        objects[size-1] = null;
    }

    @Override
    public void push(E e) {
        if (objects.length>=size){
            return;
        }

        objects[size] = e;

    }

    @Override
    public boolean isEmpty() {

        return size==0? true:false;

    }

    @Override
    public E getMin() {
        return null;
    }

    @Override
    public E getMax() {
        return null;
    }
}
