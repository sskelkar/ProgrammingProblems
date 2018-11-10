package binarytree.binarySearchTree.recoverBST;

import binarytree.BinaryTree;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class BSTRecovererTest {
    @Test
    public void recoverBSTIfTwoOfItsNodesAreSwapped() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                10, 5, 8, 2, 20, null, null, null, null, null, null));

        //when
        new BSTRecoverer().recover(tree);

        //then
        assertEquals(asList(2, 5, 8, 10, 20), tree.inOrder());
    }

    @Test
    public void returnNodesOfBSTThatAreSwapped() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, null, null, null, null));

        //when
        ArrayList<Integer> result = new BSTRecoverer().findSwappedNodes(tree);

        //then
        assertEquals(asList(1, 2), result);
    }
}