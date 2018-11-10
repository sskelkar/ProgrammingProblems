package binarytree.traversal.zigzagTraversal;

import binarytree.BinaryTree;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class ZigzagTraverserTest {
    /* Tree structure:
     *                              1
     *                       2             3
     *                  4          5 6           7
     *             8        9 10
     */
    @Test
    public void zigzagTraverseTheBinaryTree() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null, null, null, null, null, null, null, null, null, null, null));

        //when
        List<Integer> zigzagTraversalResult = new ZigzagTraverser().traverseZigzag(tree);

        //then
        assertEquals(asList(1, 2, 3, 7, 6, 5, 4, 8, 9, 10), zigzagTraversalResult);
    }
}