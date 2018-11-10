package binarytree.binarySearchTree.recoverBST;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.ArrayList;

public class BSTRecoverer {
    private Node one;
    private Node adjacentToOne;
    private Node two;

    public void recover(BinaryTree tree) {
        inOrder(null, tree.getRoot());
        if (one != null && two != null) {
            swap(one, two);
        } else if (one != null && adjacentToOne != null) {
            swap(one, adjacentToOne);
        }
    }

    private Node inOrder(Node prev, Node curr) {
        if (curr == null) return prev;

        prev = inOrder(prev, curr.left);
        if (prev != null && prev.data > curr.data) {
            if (one == null) {
                one = prev;
                adjacentToOne = curr;
            } else
                two = curr;
        }
        return inOrder(curr, curr.right);
    }

    public ArrayList<Integer> findSwappedNodes(BinaryTree tree) {
        inOrder(null, tree.getRoot());
        ArrayList<Integer> result = new ArrayList<>();

        if (one != null && two != null) {
            result.add(two.data);
            result.add(one.data);
        } else if (one != null && adjacentToOne != null) {
            result.add(adjacentToOne.data);
            result.add(one.data);
        }
        return result;
    }

    private void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
}
