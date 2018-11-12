package linkedList.cloneListWithRandomPointer;

import com.google.common.collect.Lists;
import linkedList.LinkedList;
import linkedList.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedListWithRandomPointer {
    public LinkedList clone(LinkedList ll) {
        Map<Integer, Node> created = new HashMap<>();
        Map<Integer, List<Node>> randGoal = new HashMap<>();

        Node old = ll.getHead();
        Node newHead = null;
        Node prev = null;

        while (old != null) {
            if (newHead == null) {
                newHead = new Node(old.data);
                prev = newHead;
            } else {
                prev.next = new Node(old.data);
                prev = prev.next;
            }
            created.put(prev.data, prev);
            if (old.rand == null)
                prev.rand = null;
            else if (created.get(old.rand.data) != null) {
                prev.rand = created.get(old.rand.data);
            } else {
                addToRandGoal(randGoal, old.rand.data, prev);
            }

            if (randGoal.get(prev.data) != null) {
                List<Node> nodes = randGoal.get(prev.data);
                for (Node node : nodes) {
                    node.rand = prev;
                }
            }

            old = old.next;
        }

        return new LinkedList(newHead);
    }

    private void addToRandGoal(Map<Integer, List<Node>> randGoal, int num, Node node) {
        if (randGoal.get(num) == null) {
            randGoal.put(num, Lists.newArrayList(node));
        } else {
            List<Node> list = randGoal.get(num);
            list.add(node);
            randGoal.put(num, list);
        }
    }
}
