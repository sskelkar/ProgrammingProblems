package binarytree.convertToLinkedList;

import binarytree.BinaryTree;
import binarytree.Node;

public class TreeFlattener {
    public Node flatten(BinaryTree tree) {
        Node curr = tree.getRoot();

        while (curr != null) {
            if (curr.left != null) {
                Node right = curr.right;
                curr.right = curr.left;

                Node temp = curr.right;
                while (temp.right != null)
                    temp = temp.right;
                temp.right = right;
                curr.left = null;
            }
            curr = curr.right;
        }
        return tree.getRoot();
    }
}
