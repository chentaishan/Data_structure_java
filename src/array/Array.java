package array;


/**
 * 实现增删改查
 */
public class Array<E> {
    E[] arr;
    int size;

    public Array() {
        this(10);
    }

    public Array(int capactity) {
        arr = (E[]) new Object[capactity];
        size = 0;
    }

    public int getCapacity() {

        return arr.length;
    }

    public int getSize() {

        return size;
    }

    public boolean isEmpty() {

        return size == 0;
    }


    /**
     * 第一位添加
     */
    public void addFirst(E e) {
        add(0, e);
    }

    public E getFirst() {

        return arr[0];
    }

    public void addLast(E e) {

        add(size, e);
    }

    public void removeLast() {

        remove(size - 1);
    }

    public void set(int index, E e) {
        if (index <= size - 1) {
            arr[index] = e;
        } else {

            throw new IllegalArgumentException("index =" + index + "-size=" + size);
        }
    }

    /**
     * 0-1-2-3-4-5-6-0-0-0
     * <p>
     * 假如要删除4，把5位替换4的位置，以此类推，最后的6设置为0
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        E ret = arr[index];

        for (int x = index + 1; x < size; x++) {
            arr[x - 1] = arr[x];

        }

        size--;
        arr[size] = null;

        return ret;
    }

    /**
     * 向固定位置插入数据
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {

        if (index > size || index < 0) {
            throw new IllegalArgumentException("index is error!");
        }
        if (size == arr.length) {
            resize(arr.length*2);
        }
        for (int x = size - 1; x >= index; x--)
            arr[x + 1] = arr[x];

        arr[index] = (E) e;

        size++;

    }
    // 将数组空间的容量变成newCapacity大小
    private void resize(int newCapacity){

        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0 ; i < size ; i ++)
            newData[i] = arr[i];
        arr = newData;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        for (E e : arr) {
            stringBuffer.append(e + "\n");
        }

        return stringBuffer.toString();
    }



    public E get(int index) {

        return arr[index];
    }

    public void swap(int x, int y) {
        E e = arr[x];
        arr[x] = arr[y];
        arr[y] = e;


    }
}
