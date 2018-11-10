package binarytree.traversal.zigzagTraversal;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigzagTraverser {
    public List<Integer> traverseZigzag(BinaryTree tree) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        boolean leftFirst = false;

        s1.push(tree.getRoot());
        while (!s1.isEmpty()) {
            Node curr = s1.pop();
            result.add(curr.data);

            if (leftFirst) {
                if (curr.left != null) s2.push(curr.left);
                if (curr.right != null) s2.push(curr.right);
            } else {
                if (curr.right != null) s2.push(curr.right);
                if (curr.left != null) s2.push(curr.left);
            }

            if (s1.isEmpty()) {
                Stack<Node> temp = s1;
                s1 = s2;
                s2 = temp;

                leftFirst = !leftFirst;
            }
        }
        return result;
    }
}
