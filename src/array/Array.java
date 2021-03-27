package array;



/**
 * 实现增删改查
 */
public class Array<E> {
    E [] arr;
    int size;

    public Array() {
        this(10);
    }

    public Array(int capactity) {
        arr = (E[])new Object[capactity];
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

    public E getFirst(){

        return  arr[0];
    }

    public void addLast(E e) {

        add(size, e);
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
     *
     * 假如要删除4，把5位替换4的位置，以此类推，最后的6设置为0
     * @param index
     * @return
     */
    public E remove(int index) {
        E ret = arr[index];
        if (index <= size - 1) {

            for (int x = index+1; x<size; x++) {
                arr[x - 1] = arr[x];
                if (x==size-1){
                    arr[x]=null;
                }
            }
            size--;
        }
        return ret;
    }

    /**
     * 向固定位置插入数据
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (size == arr.length) {
            throw new IllegalArgumentException("arr is full !");
        }
        if (index > size || index < 0) {
            throw new IllegalArgumentException("index is error!");
        }

        for (int x = size - 1; x >= index; x--)
            arr[x + 1] = arr[x];

        arr[index] = (E)e;

        size++;

    }


    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();

        for (E e :  arr) {
            stringBuffer.append(e + "\n");
        }

        return stringBuffer.toString();
    }

    /**
     * 扩容
     * @param newCaptity
     */
    public void resize(int newCaptity){

        E [] newData = (E[]) new Object[newCaptity];

        for (int i = 0; i < size; i++) {
            newData[i] = arr[i];
        }

        arr = newData;

    }
}
