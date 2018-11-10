package binarytree.depth.minDepth;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class MinDepthTest {
    @Test
    public void calculateMinDepthOfATree() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, null, null, 6, null, 7, null, null, null, null, 8, null, null));

        //then
        assertEquals(2, new MinDepth().calculate(tree));
    }

    @Test
    public void calculateMinDepthOfATree2() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, null, null, 3, null, null));

        //then
        assertEquals(3, new MinDepth().calculate(tree));
    }
}