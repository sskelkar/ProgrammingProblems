package binarytree.leastCommonAncestor;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.Optional;

import static java.lang.Integer.MIN_VALUE;

public class LeastCommonAncestorFinder {
    private static class Result {
        public final Node node;
        public final boolean foundBoth;

        public Result(Node node, boolean foundBoth) {
            this.node = node;
            this.foundBoth = foundBoth;
        }
    }

    public int find(BinaryTree tree, int a, int b) {
        return Optional.of(lca(tree.getRoot(), a, b))
                .filter(result -> result.foundBoth)
                .map(result -> result.node)
                .map(node -> node.data)
                .orElse(MIN_VALUE);
    }

    private Result lca(Node curr, int a, int b) {
        if (curr == null) return new Result(null, false);

        if (curr.data == a || curr.data == b) {
            return new Result(curr, a == b ||
                    lca(curr.left, a, b).node != null ||
                    lca(curr.right, a, b).node != null);
        }

        Result left = lca(curr.left, a, b);
        Result right = lca(curr.right, a, b);

        if (left.node != null && right.node != null)
            return new Result(curr, true);

        return left.node != null ?
                new Result(left.node, left.foundBoth) :
                new Result(right.node, right.foundBoth);
    }
}
