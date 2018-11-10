package binarytree.depth.minDepth;

import binarytree.BinaryTree;
import binarytree.Node;

public class MinDepth {
    public int calculate(BinaryTree tree) {
        return minDepth(tree.getRoot());
    }

    private int minDepth(Node curr) {
        if (curr == null) return 0;

        int left = minDepth(curr.left);
        int right = minDepth(curr.right);

        // cannot simply use Math.min because we need to ignore null branch
        // find min of left and right while disregarding them if they are 0.
        int min = left;
        if (right > 0) {
            if (min > 0) {
                min = Math.min(min, right);
            } else {
                min = right;
            }
        }
        return 1 + min;
    }
}
