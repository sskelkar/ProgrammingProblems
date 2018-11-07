package binarytree.verticalTraversal;

import binarytree.BinaryTree;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class VerticalTraverserTest {
    /* Tree structure:
     *                              1
     *                       2             3
     *                  4          5 6           7
     *             8        9 10
     */
    @Test
    public void verticallyTraverseTheBinaryTree() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null, null, null, null, null, null, null, null, null, null, null));

        //when
        List<List<Integer>> verticalTraversalResult = new VerticalTraverser().traverseVertically(tree);

        //then
        List<List<Integer>> expected = asList(
                asList(8),
                asList(4),
                asList(2, 9, 10),
                asList(1, 5, 6),
                asList(3),
                asList(7)
        );
        assertEquals(expected, verticalTraversalResult);
    }
}