package binarytree.pairWithGivenSum;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBinaryTree {
    public boolean pairExistsWithSum(BinaryTree tree, int sum) {
        return pairExists(tree.getRoot(), sum, new HashSet<>());
    }

    private boolean pairExists(Node curr, int sum, Set<Integer> set) {
        if (curr == null) return false;

        if (set.contains(sum - curr.data)) {
            return true;
        } else {
            set.add(curr.data);
        }

        return pairExists(curr.left, sum, set) || pairExists(curr.right, sum, set);
    }
}
