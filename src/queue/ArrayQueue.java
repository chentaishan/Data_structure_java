package queue;

import com.example.datastructure.array.Array;

/**
 * 先进先出
 *
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {

    Array<E>  array = new Array<>();



    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {

        array.addLast(e);
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }


}
