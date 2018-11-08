package binarytree.convertToLinkedList;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeToDoublyLinkedListConverter {
    private Node head;
    private Node prev;

    public Node convertInPlace(BinaryTree tree) {
        head = prev = null;
        toDLL(tree.getRoot());
        return head;
    }

    private void toDLL(Node curr) {
        if (curr == null) return;

        toDLL(curr.left);
        if (prev == null) {
            head = curr;
        } else {
            prev.right = curr;
            curr.left = prev;
        }
        prev = curr;
        toDLL(curr.right);
    }

    public Node convertUsingList(BinaryTree tree) {
        List<Node> nodes = new ArrayList<>();
        populateNodes(tree.getRoot(), nodes);

        for (int i = 1; i < nodes.size(); i++) {
            nodes.get(i).left = nodes.get(i - 1);
            nodes.get(i - 1).right = nodes.get(i);
        }
        return nodes.get(0);
    }

    private void populateNodes(Node curr, List<Node> nodes) {
        if (curr == null) return;

        populateNodes(curr.left, nodes);
        nodes.add(curr);
        populateNodes(curr.right, nodes);
    }
}
