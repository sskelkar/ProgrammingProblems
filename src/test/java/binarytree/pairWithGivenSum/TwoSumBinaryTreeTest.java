package binarytree.pairWithGivenSum;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoSumBinaryTreeTest {
    @Test
    public void findIfPairWithGivenSumExists() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                15, 10, 20, 8, 12, 16, 25, null, null, null, null, null, null, null, null
        ));

        //then
        assertTrue(new TwoSumBinaryTree().pairExistsWithSum(tree, 28));
        assertFalse(new TwoSumBinaryTree().pairExistsWithSum(tree, 29));
        assertFalse(new TwoSumBinaryTree().pairExistsWithSum(tree, 100));
    }
}