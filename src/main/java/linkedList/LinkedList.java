package linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public static LinkedList from(List<Integer> values) {
        if (values.size() == 0)
            return new LinkedList(null);

        Node head = new Node(values.get(0));
        Node prev = head;
        for (int i = 1; i < values.size(); i++) {
            prev.next = new Node(values.get(i));
            prev = prev.next;
        }
        return new LinkedList(head);
    }

    public List<Integer> values() {
        List<Integer> values = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            values.add(curr.data);
            curr = curr.next;
        }
        return values;
    }

    public int size() {
        return values().size();
    }

    public Node get(int index) {
        if (index >= size())
            throw new IllegalArgumentException("out of bound");

        Node curr = head;
        int i = 0;
        while (i != index) {
            curr = curr.next;
            i++;
        }
        return curr;
    }

    public void randomize() {
        int bound = size();
        Random rand = new Random();
        for (int i = 0; i < size(); i++) {
            int randomIndex = rand.nextInt(2 * bound);
            if (randomIndex >= bound)
                get(i).rand = null;
            else
                get(i).rand = get(randomIndex);
        }
    }
}
