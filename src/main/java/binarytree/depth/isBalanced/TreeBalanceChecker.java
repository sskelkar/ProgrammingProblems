package binarytree.depth.isBalanced;

import binarytree.BinaryTree;
import binarytree.Node;

public class TreeBalanceChecker {
    public boolean isBalanced(BinaryTree tree) {
        return isB(tree.getRoot()) != -1;
    }

    private int isB(Node curr) {
        if (curr == null) return 0;

        int left = isB(curr.left);
        int right = isB(curr.right);

        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }
}
