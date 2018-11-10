package binarytree.binarySearchTree;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.Stack;

public class BSTIterator {
    private Stack<Node> stack;

    public BSTIterator(BinaryTree tree) {
        stack = new Stack<>();
        Node curr = tree.getRoot();
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public Integer next() {
        Node curr = stack.pop();
        Node sibling = curr.right;
        while (sibling != null) {
            stack.push(sibling);
            sibling = sibling.left;
        }
        return curr.data;
    }
}
