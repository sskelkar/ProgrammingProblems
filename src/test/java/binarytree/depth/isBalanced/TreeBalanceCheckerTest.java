package binarytree.depth.isBalanced;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreeBalanceCheckerTest {
    @Test
    public void determineIfATreeIsHeightBalanced() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, null, null, null, null, null));

        //then
        assertTrue(new TreeBalanceChecker().isBalanced(tree));
    }

    @Test
    public void determineIfATreeIsHeightBalanced2() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, null, null, null, null, 5, null, null));

        //then
        assertFalse(new TreeBalanceChecker().isBalanced(tree));
    }

    @Test
    public void determineIfATreeIsHeightBalanced3() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, null, 5, 6, 7, null, null, null, null, 8, null, null, null, null));

        //then
        assertFalse(new TreeBalanceChecker().isBalanced(tree));
    }

    @Test
    public void determineIfATreeIsHeightBalanced4() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, null, 5, 6, null, null, null, null, null, null));

        //then
        assertTrue(new TreeBalanceChecker().isBalanced(tree));
    }
}