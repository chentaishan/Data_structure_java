package queue;


/*
循环队列
front==tail  队列为null
front ：首位的index
tail: 队列后的null位置

tail+1=front 或者 (tail+1) %c  = front队列满
 */
public class LoopQueue<E> implements Queue<E> {

    private E[]  array ;
    int front;
    int tail;
    int size;

    public LoopQueue(int capcity){
        array = (E[]) new Object[capcity];
    }
    public LoopQueue(){
        this(10);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }

    /**
     * 插入数据
     * @param e
     */
    @Override
    public void enqueue(E e) {

        if ((tail+1)%size==front){

            resize(getCapcity()*2);
        }
        array[tail] = e;
        tail = (tail+1)%array.length;
        size++;

    }

    /**
     * 删除队列头部数据
     * @param e
     */
    public void dequeue(E e){

        if (isEmpty()){

            throw new IllegalArgumentException("cannot dequeue front an empty enqueue!");

        }
        E ret = array[front];

        array[front]=null;

        front = (front+1)%array.length;
        size--;
        if (size==getCapcity()/4&&getCapcity()>0){
            resize(getCapcity()/2);
        }

    }

    private void resize(int capcity) {
        E[] newData = (E[]) new Object[capcity+1];

        for (int i = 0; i < size; i++) {
            newData[i] = array[(i+front)%array.length];
        }
        newData = array;
        front=0;
        tail= size;
    }

    /**
     * 获取容量，tail是最后一位+1，因此length-1
     * @return
     */
    public int getCapcity(){
        return array.length-1;
    }

    @Override
    public E getFront() {
        return array[0];
    }
}
