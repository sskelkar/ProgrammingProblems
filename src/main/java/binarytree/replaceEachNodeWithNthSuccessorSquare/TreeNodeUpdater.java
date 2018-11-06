package binarytree.replaceEachNodeWithNthSuccessorSquare;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeUpdater {

    public void replaceWithSquareOfNthSuccessor(BinaryTree tree, int n) {
        List<Node> nodes = new ArrayList<>();
        populate(nodes, tree.getRoot());

        for (int i = 0; i < nodes.size() - n; i++) {
            Node curr = nodes.get(i);
            Node succ = nodes.get(i + n);
            curr.data = succ.data * succ.data;
        }
    }

    private void populate(List<Node> nodes, Node curr) {
        if (curr == null) return;

        populate(nodes, curr.left);
        nodes.add(curr);
        populate(nodes, curr.right);
    }
}
