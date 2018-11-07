package binarytree.checkIfTreesAreIdentical;

import binarytree.BinaryTree;
import binarytree.Node;

public class IdenticalTreeChecker {
    public boolean areIdentical(BinaryTree tree1, BinaryTree tree2) {
        return areIdentical(tree1.getRoot(), tree2.getRoot());
    }

    private boolean areIdentical(Node one, Node two) {
        if (one == null && two == null) return true;
        if (one == null || two == null) return false;

        return one.data == two.data && areIdentical(one.left, two.left)
                && areIdentical(one.right, two.right);
    }
}
