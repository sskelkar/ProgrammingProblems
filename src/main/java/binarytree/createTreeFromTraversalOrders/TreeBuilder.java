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
        return new BinaryTree(build(inOrderIndexes, 0, inOrder.size() - 1, postOrder, postOrder.size() - 1));
    }

    private Node build(Map<Integer, Integer> inOrderIndexes, int inLeft, int inRight, List<Integer> postOrder, int postIndex) {
        Node curr = new Node(postOrder.get(postIndex));

        int inorderIndex = inOrderIndexes.get(postOrder.get(postIndex));

        int onRight = inRight - inorderIndex;
        int onLeft = inorderIndex - inLeft;

        if (onRight > 0) {
            curr.right = build(inOrderIndexes, inorderIndex + 1, inRight, postOrder, postIndex - 1);
        }

        if (onLeft > 0) {
            curr.left = build(inOrderIndexes, inLeft, inorderIndex - 1, postOrder, postIndex - onRight - 1);
        }
        return curr;
    }
}
