package stack;

import java.util.ArrayList;
import java.util.Stack;

//https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
public class LargestRectangleInHistogram {
    public int calculateArea(ArrayList<Integer> input) {
        input.add(0);
        Stack<Integer> indexes = new Stack<>();
        indexes.push(0);
        int maxArea = input.get(0);
        for (int i = 1; i < input.size(); i++) {
            while (!indexes.isEmpty() && input.get(i) < input.get(indexes.peek())) {
                int indexOfLastElement = indexes.pop();
                int indexOfLeftEdgeOfHistogram = indexes.isEmpty() ? 0 : indexes.peek() + 1;
                int areaOfLastElement = (i - indexOfLeftEdgeOfHistogram) * input.get(indexOfLastElement);
                if (areaOfLastElement > maxArea)
                    maxArea = areaOfLastElement;
            }
            indexes.push(i);
        }
        return maxArea;
    }
}
