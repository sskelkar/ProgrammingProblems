package binarytree.binarySearchTree.kthSmallestElement;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.Stack;

public class KthSmallestElement {
    public int smallest(BinaryTree tree, int k) {
        Stack<Node> nodes = new Stack<>();
        populate(tree.getRoot(), nodes, k);
        return nodes.pop().data;
    }

    private void populate(Node curr, Stack<Node> nodes, int k) {
        if (curr == null) return;
        populate(curr.left, nodes, k);
        if (nodes.size() == k) return;
        nodes.push(curr);
        populate(curr.right, nodes, k);
    }

}
