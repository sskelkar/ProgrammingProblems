package binarytree.maxDepth;

import binarytree.BinaryTree;
import binarytree.Node;

public class MaxDepth {
    public int calculate(BinaryTree tree) {
        return maxDepth(tree.getRoot());
    }

    private int maxDepth(Node curr) {
        if (curr == null) return 0;

        return 1 + Math.max(maxDepth(curr.left), maxDepth(curr.right));
    }
}
