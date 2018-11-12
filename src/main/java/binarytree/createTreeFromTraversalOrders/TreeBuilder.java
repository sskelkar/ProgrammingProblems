package binarytree.createTreeFromTraversalOrders;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeBuilder {
    public BinaryTree fromInorderAndPostorder(List<Integer> inOrder, List<Integer> postOrder) {
        Map<Integer, Integer> inOrderIndexes = new HashMap<>();
        for (int i = 0; i < inOrder.size(); i++)
            inOrderIndexes.put(inOrder.get(i), i);
        return new BinaryTree(inAndPostOrder(inOrderIndexes, 0, inOrder.size() - 1, postOrder, postOrder.size() - 1));
    }

    private Node inAndPostOrder(Map<Integer, Integer> inOrderIndexes, int inLeft, int inRight, List<Integer> postOrder, int postIndex) {
        Node curr = new Node(postOrder.get(postIndex));

        int inorderIndex = inOrderIndexes.get(postOrder.get(postIndex));

        int onRight = inRight - inorderIndex;
        int onLeft = inorderIndex - inLeft;

        if (onRight > 0) {
            curr.right = inAndPostOrder(inOrderIndexes, inorderIndex + 1, inRight, postOrder, postIndex - 1);
        }

        if (onLeft > 0) {
            curr.left = inAndPostOrder(inOrderIndexes, inLeft, inorderIndex - 1, postOrder, postIndex - onRight - 1);
        }
        return curr;
    }

    public BinaryTree fromInorderAndPreorder(List<Integer> inOrder, List<Integer> preOrder) {
        Map<Integer, Integer> inOrderIndexes = new HashMap<>();
        for (int i = 0; i < inOrder.size(); i++)
            inOrderIndexes.put(inOrder.get(i), i);
        Node root = inAndPreOrder(inOrderIndexes, preOrder, 0, inOrder.size() - 1, 0);
        return new BinaryTree(root);
    }

    private Node inAndPreOrder(Map<Integer, Integer> inOrderIndexes, List<Integer> preOrder, int inLeft, int inRight, int preIndex) {
        Node curr = new Node(preOrder.get(preIndex));
        int inIndex = inOrderIndexes.get(preOrder.get(preIndex));

        int onLeft = inIndex - inLeft;
        int onRight = inRight - inIndex;

        if (onLeft > 0)
            curr.left = inAndPreOrder(inOrderIndexes, preOrder, inLeft, inIndex - 1, preIndex + 1);

        if (onRight > 0)
            curr.right = inAndPreOrder(inOrderIndexes, preOrder, inIndex + 1, inRight, preIndex + onLeft + 1);

        return curr;
    }
}
