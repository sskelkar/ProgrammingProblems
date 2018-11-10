package binarytree.populateNextRightPointer;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class PopulateNextRightPointer {
    public void populate(BinaryTree tree) {
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        if (tree.getRoot() != null)
            q1.add(tree.getRoot());

        while(!q1.isEmpty()) {
            Node curr = q1.remove();
            curr.next = q1.peek();

            if(curr.left != null)
                q2.add(curr.left);
            if(curr.right != null)
                q2.add(curr.right);

            if(q1.isEmpty()) {
                Queue<Node> temp = q1;
                q1 = q2;
                q2 = temp;
            }
        }
    }
}
