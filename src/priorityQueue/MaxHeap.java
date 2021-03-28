package priorityQueue;

import array.Array;

/**
 * 最大堆
 */
public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;
    public MaxHeap() {
        this(10);
    }
    public MaxHeap(int capacity) {
        this.data = new Array<>(capacity);
    }


    public int getSize(){

        return data.getSize();
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
    private int parent(int index){
        if (index==0)
            throw new IllegalArgumentException("can't in zero");
        return index/2;
    }

    private int leftChild(int index){
        return index*2+1;
    }
    private int rightChild(int index){
        return index*2+2;
    }

    /**
     * 添加元素
     * @param e
     */
    public void add(E e){
        data.addLast(e);
//        上浮操作
        siftUp(data.getSize()-1);

    }

    private void siftUp(int k) {
        while (k>0&&data.get(parent(k)).compareTo(data.get(k))<0){
            data.swap(k,parent(k));
            k = parent(k);
        }
    }


    public E get(int i) {
        return data.get(i);
    }

    public E getMaxandRemove(){
        E e = findmax();
        data.swap(0,data.getSize()-1);
        data.removeLast();

        siftDown(0);
        return e;
    }

    private void siftDown(int i) {

        while (leftChild(i)<data.getSize()){

            int j = leftChild(i); // 在此轮循环中,data[k]和data[j]交换位置
            if( j + 1 < data.getSize() &&
                    data.get(j + 1).compareTo(data.get(j)) > 0 )
                j ++;
            // data[j] 是 leftChild 和 rightChild 中的最大值

            if(data.get(i).compareTo(data.get(j)) >= 0 )
                break;

            data.swap(i, j);
            i = j;

        }


    }

    /**
     * 查找最大值
     * @return
     */
    private E findmax() {
        if (data.getSize()==0){
            throw new IllegalArgumentException("heap is empty!");
        }
        return data.get(0);
    }
}
