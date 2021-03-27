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
        return index*2;
    }
    private int rightChild(int index){
        return index*2+1;
    }
}
