package queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public ArrayList<Integer> find(ArrayList<Integer> input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && input.get(i) > deque.peekLast())
                deque.removeLast();
            deque.addLast(input.get(i));
        }

        for (int i = k; i < input.size(); i++) {
            result.add(deque.peekFirst());
            if (input.get(i - k).equals(deque.peekFirst()))
                deque.removeFirst();

            while (!deque.isEmpty() && input.get(i) > deque.peekLast())
                deque.removeLast();
            deque.addLast(input.get(i));
        }
        result.add(deque.peekFirst());
        return result;
    }
}
