package binarytree.pathSum;

import binarytree.BinaryTree;
import binarytree.Node;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;

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

    public int maxPathSum(BinaryTree tree) {
        return maxPathSum(tree.getRoot()).fullPathSum;
    }

    public List<Integer> pathWithMaxSum(BinaryTree tree) {
        return maxPathSum(tree.getRoot()).fullPathWithCurr;
    }

    private Result maxPathSum(Node curr) {
        if (curr == null) return new Result(MIN_VALUE, of(), MIN_VALUE, of());

        Result left = maxPathSum(curr.left);
        Result right = maxPathSum(curr.right);

        int partialPathSumWithCurr = max(curr.data, (curr.data + maxOrDefault(left.partialPathSum, right.partialPathSum, 0)));
        List<Integer> partialPathWithCurr = getPartialPathWithCurr(curr, left, right);

        int fullPathSumWithCurr = valueOrDefault(left.partialPathSum, 0) + curr.data + valueOrDefault(right.partialPathSum, 0);
        int maxPathSumSoFar = max(curr.data, max(fullPathSumWithCurr, maxOrDefault(left.fullPathSum, right.fullPathSum, fullPathSumWithCurr)));

        List<Integer> maxFullPathSoFar = getMaxFullPathSoFar(curr, left, right, fullPathSumWithCurr);

        return new Result(
                partialPathSumWithCurr,
                partialPathWithCurr,
                maxPathSumSoFar,
                maxFullPathSoFar
        );
    }

    private List<Integer> getMaxFullPathSoFar(Node curr, Result left, Result right, int fullPathSumWithCurr) {
        List<Integer> maxFullPathSoFar = Lists.newArrayList(curr.data);
        if (fullPathSumWithCurr > max(curr.data, maxOrDefault(left.fullPathSum, right.fullPathSum, curr.data))) {
            maxFullPathSoFar = new ArrayList<>(left.partialPathWithCurr);
            maxFullPathSoFar.add(curr.data);
            maxFullPathSoFar.addAll(right.partialPathWithCurr);
        } else if (isGreaterThan(left.fullPathSum, max(curr.data, max(fullPathSumWithCurr, valueOrDefault(right.fullPathSum, fullPathSumWithCurr))))) {
            maxFullPathSoFar = new ArrayList<>(left.fullPathWithCurr);
        } else if (isGreaterThan(right.fullPathSum, max(curr.data, max(fullPathSumWithCurr, valueOrDefault(left.fullPathSum, fullPathSumWithCurr))))) {
            maxFullPathSoFar = new ArrayList<>(right.fullPathWithCurr);
        }
        return maxFullPathSoFar;
    }

    private List<Integer> getPartialPathWithCurr(Node curr, Result left, Result right) {
        List<Integer> partialPathWithCurr = new ArrayList<>();
        if (curr.data >= curr.data + maxOrDefault(left.partialPathSum, right.partialPathSum, 0)) {
            partialPathWithCurr.add(curr.data);
        } else {
            if (isGreaterThan(left.partialPathSum, right.partialPathSum)) {
                partialPathWithCurr.addAll(left.partialPathWithCurr);
                partialPathWithCurr.add(curr.data);
            } else if (isGreaterThan(right.partialPathSum, left.partialPathSum)) {
                partialPathWithCurr.add(curr.data);
                partialPathWithCurr.addAll(right.partialPathWithCurr);
            }
        }
        return partialPathWithCurr;
    }

    private int valueOrDefault(Integer val, Integer defaultVal) {
        return val == MIN_VALUE ? defaultVal : val;
    }

    private boolean isGreaterThan(Integer one, Integer two) {
        if (one == MIN_VALUE && two == MIN_VALUE)
            return false;
        else if (two == MIN_VALUE)
            return true;
        else if (one == MIN_VALUE)
            return false;
        else return one > two;
    }

    private int maxOrDefault(Integer one, Integer two, Integer defaultVal) {
        if (one == MIN_VALUE && two == MIN_VALUE)
            return defaultVal;
        else if (one == MIN_VALUE)
            return two;
        else if (two == null)
            return one;
        else return max(one, two);
    }

    private static class Result {
        final Integer partialPathSum;
        final List<Integer> partialPathWithCurr;
        final Integer fullPathSum;
        final List<Integer> fullPathWithCurr;

        Result(Integer partialPathSum, List<Integer> partialPathWithCurr, Integer fullPathSum, List<Integer> fullPathWithCurr) {
            this.partialPathSum = partialPathSum;
            this.partialPathWithCurr = partialPathWithCurr;
            this.fullPathSum = fullPathSum;
            this.fullPathWithCurr = fullPathWithCurr;
        }
    }
}
