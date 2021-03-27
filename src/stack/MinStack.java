package stack;

/**
 * 求 最小栈
 */
public class MinStack {

    int min = Integer.MIN_VALUE;
    java.util.Stack<Integer> stacks  ;
    /** initialize your data structure here. */
    public MinStack() {
        stacks = new java.util.Stack();
    }

    public void push(int x) {

        if (x<min){
            min = x;
        }
        stacks.push(x);
    }

    public void pop() {

        stacks.pop();
    }

    public int top() {

        return stacks.peek();
    }

    public int getMin() {

        return min;
    }
}
