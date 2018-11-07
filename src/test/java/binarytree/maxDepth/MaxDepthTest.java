package binarytree.maxDepth;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class MaxDepthTest {

    @Test
    public void calculateMaxDepthOfATree() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, null, null, 6, null, 7, null, null, null, null, 8, null, null));

        //then
        assertEquals(5, new MaxDepth().calculate(tree));
    }
}