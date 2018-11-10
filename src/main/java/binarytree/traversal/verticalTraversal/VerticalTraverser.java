package binarytree.traversal.verticalTraversal;

import binarytree.BinaryTree;
import binarytree.Node;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.toList;

public class VerticalTraverser {
    public List<List<Integer>> traverseVertically(BinaryTree tree) {
        Map<Integer, List<Integer>> offsetToElementList = new TreeMap<>();

        traverse(tree.getRoot(), 0, offsetToElementList);
        return offsetToElementList.entrySet().stream()
                .map(Map.Entry::getValue)
                .collect(toList());
    }

    private void traverse(Node curr, int offset, Map<Integer, List<Integer>> map) {
        if (curr == null) return;

        addToMap(offset, curr.data, map);
        traverse(curr.left, offset - 1, map);
        traverse(curr.right, offset + 1, map);
    }

    private void addToMap(int offset, int value, Map<Integer, List<Integer>> map) {
        List<Integer> values = map.get(offset);
        if (values == null) {
            map.put(offset, Lists.newArrayList(value));
        } else {
            values.add(value);
            map.put(offset, values);
        }
    }
}
