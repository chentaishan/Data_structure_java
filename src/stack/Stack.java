package stack;

public interface Stack<E> {

    void pop();
    void push(E e);
    boolean isEmpty();

    E getMin();
    E getMax();

}
