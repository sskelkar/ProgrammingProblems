package stack;

import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> normal = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public static MinStack from(ArrayList<Integer> input) {
        MinStack stack = new MinStack();
        for(Integer i : input)
            stack.push(i);
        return stack;
    }

    public void push(Integer i) {
        normal.push(i);
        if(min.isEmpty() || min.peek() > i)
            min.push(i);
    }

    public int getMin() {
        return min.isEmpty() ? -1 : min.peek();
    }

    public void pop() {
        if(!normal.isEmpty()) {
            int num = normal.pop();
            if(num == min.peek())
                min.pop();
        }
    }

    public int top() {
        return normal.isEmpty() ? -1 : normal.peek();
    }
}
