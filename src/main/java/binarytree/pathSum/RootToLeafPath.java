package binarytree.pathSum;

import binarytree.BinaryTree;
import binarytree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RootToLeafPath {
    public boolean pathExistsWithSum(BinaryTree tree, int num) {
        return pathExists(tree.getRoot(), 0, num);
    }

    private boolean pathExists(Node curr, int sum, int expected) {
        if (curr == null) return false;

        int sumSoFar = sum + curr.data;

        if (curr.left == null && curr.right == null) {
            return sumSoFar == expected;
        }

        return pathExists(curr.left, sumSoFar, expected) || pathExists(curr.right, sumSoFar, expected);
    }

    public List<List<Integer>> pathsWithSum(BinaryTree tree, int num) {
        List<List<Integer>> paths = new ArrayList<>();
        pathsWithSum(tree.getRoot(), 0, num, paths, new LinkedList<>());
        return paths;
    }

    private void pathsWithSum(Node curr, int sum, int expected, List<List<Integer>> result, LinkedList<Integer> path) {
        if (curr == null) return;
        path.add(curr.data);
        int sumSoFar = sum + curr.data;

        if (curr.left == null && curr.right == null && sumSoFar == expected) {
            result.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        pathsWithSum(curr.left, sumSoFar, expected, result, path);
        pathsWithSum(curr.right, sumSoFar, expected, result, path);
        path.removeLast();
    }

    public long sumOfAllNumbersRepresentedByRootToLeafPaths(BinaryTree tree) {
        List<Long> rootToLeafPathSums = new ArrayList<>();
        rootToLeafPathSums(tree.getRoot(), 0, rootToLeafPathSums);

        return rootToLeafPathSums.stream().reduce((a, b) -> a + b).orElse(0L);
    }

    private void rootToLeafPathSums(Node curr, long number, List<Long> result) {
        if (curr == null) return;
        long sumSoFar = number * 10 + curr.data;
        if (curr.left == null && curr.right == null) {
            result.add(sumSoFar);
            return;
        }

        rootToLeafPathSums(curr.left, sumSoFar, result);
        rootToLeafPathSums(curr.right, sumSoFar, result);
    }
}
