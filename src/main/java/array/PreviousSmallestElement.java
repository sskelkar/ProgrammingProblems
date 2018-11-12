package array;

import java.util.ArrayList;
import java.util.Stack;

public class PreviousSmallestElement {
    public ArrayList<Integer> find(ArrayList<Integer> input) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            while (!stack.isEmpty() && stack.peek() >= input.get(i))
                stack.pop();
            if (stack.isEmpty())
                result.add(-1);
            else result.add(stack.peek());

            stack.push(input.get(i));
        }
        return result;
    }
}
