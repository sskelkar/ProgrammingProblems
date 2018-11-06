package binarytree.flipATree;

import binarytree.BinaryTree;
import binarytree.Node;

public class TreeFlipper {
    public void flip(BinaryTree tree) {
        flip(tree.getRoot());
    }

    private void flip(Node curr) {
        if(curr==null)return;

        Node temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;

        flip(curr.left);
        flip(curr.right);
    }
}
