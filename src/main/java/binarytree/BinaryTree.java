package binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public static BinaryTree from(List<Integer> input) {
        Node root = new Node(input.get(0));
        addToTree(root, 0, input);
        return new BinaryTree(root);
    }

    private static void addToTree(Node curr, int index, List<Integer> input) {
        while(index < input.size() && input.get(index) == null) {
            index++;
        }
        if(index >= input.size()) return;
        index = effectiveIndex(index, input);
        int leftChild = 2 * index + 1;
        if (leftChild < input.size() && input.get(leftChild) != null) {
            curr.left = new Node(input.get(leftChild));
            addToTree(curr.left, leftChild, input);
        }

        int rightChild = 2 * index + 2;
        if (rightChild < input.size() && input.get(rightChild) != null) {
            curr.right = new Node(input.get(rightChild));
            addToTree(curr.right, rightChild, input);
        }
    }

    private static int effectiveIndex(int idx, List<Integer>input) {
        int effective=0;
        for(int i=1;i<=idx;i++) {
            if(input.get(i) != null) {
                effective++;
            }
        }
        return effective;
    }

    public List<Integer> inOrder() {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(Node curr, List<Integer> result) {
        if(curr == null) return;
        inOrder(curr.left, result);
        result.add(curr.data);
        inOrder(curr.right, result);
    }

    public List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(Node curr, List<Integer> result) {
        if(curr == null) return;
        result.add(curr.data);
        preOrder(curr.left, result);
        preOrder(curr.right, result);
    }

    public Node getRoot() {
        return root;
    }
}
