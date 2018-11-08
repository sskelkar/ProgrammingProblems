package binarytree.binarySearchTree.arrayToTree;

import binarytree.BinaryTree;
import binarytree.Node;

public class ArrayToBSTCreator {
    public BinaryTree createFrom(int[] array) {
        return new BinaryTree(convert(array, 0, array.length - 1));
    }

    private Node convert(int[] array, int left, int right) {
        if (right < left) return null;
        int mid = (left + right) / 2;

        Node curr = new Node(array[mid]);
        curr.left = convert(array, left, mid - 1);
        curr.right = convert(array, mid + 1, right);
        return curr;
    }
}
