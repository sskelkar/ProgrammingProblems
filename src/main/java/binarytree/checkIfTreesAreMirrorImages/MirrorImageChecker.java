package binarytree.checkIfTreesAreMirrorImages;

import binarytree.BinaryTree;
import binarytree.Node;

public class MirrorImageChecker {
    public boolean areMirrors(BinaryTree tree1, BinaryTree tree2) {
        return areMirrors(tree1.getRoot(), tree2.getRoot());
    }

    private boolean areMirrors(Node one, Node two) {
        if (one == null && two == null) return true;
        if (one == null || two == null) return false;

        return one.data == two.data && areMirrors(one.left, two.right) && areMirrors(one.right, two.left);
    }
}
