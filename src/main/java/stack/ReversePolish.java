package stack;

import java.util.ArrayList;
import java.util.Stack;

public class ReversePolish {
    public int evaluate(ArrayList<String> expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.size(); i++) {
            if (expression.get(i).equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (expression.get(i).equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (expression.get(i).equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (expression.get(i).equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else stack.push(Integer.valueOf(expression.get(i)));
        }
        return stack.pop();
    }
}
