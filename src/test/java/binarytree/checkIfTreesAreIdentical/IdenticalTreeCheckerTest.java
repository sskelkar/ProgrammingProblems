package binarytree.checkIfTreesAreIdentical;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IdenticalTreeCheckerTest {
    @Test
    public void checkIfGivenTreesAreIdentical() {
        //given
        BinaryTree tree1 = BinaryTree.from(newArrayList(1, 2, 3, 4, null, 5, null, null, 6, null, null, null, null));
        BinaryTree tree2 = BinaryTree.from(newArrayList(1, 2, 3, 4, null, 5, null, null, 6, null, null, null, null));

        //then
        assertTrue(new IdenticalTreeChecker().areIdentical(tree1, tree2));
    }

    @Test
    public void checkIfGivenTreesAreIdentical2() {
        //given
        BinaryTree tree1 = BinaryTree.from(newArrayList(1, null, null));
        BinaryTree tree2 = BinaryTree.from(newArrayList(1, null, null));

        //then
        assertTrue(new IdenticalTreeChecker().areIdentical(tree1, tree2));
    }

    @Test
    public void checkIfGivenTreesAreIdentical3() {
        //given
        BinaryTree tree1 = BinaryTree.from(newArrayList(1, 2, 3, null, null, null, null));
        BinaryTree tree2 = BinaryTree.from(newArrayList(1, 2, 2, null, null, null, null));

        //then
        assertFalse(new IdenticalTreeChecker().areIdentical(tree1, tree2));
    }
}