package binarytree.replaceEachNodeWithNthSuccessorSquare;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class TreeNodeUpdaterTest {
    @Test
    public void updateEachNodeWithItsNthSuccessorsSquare() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, 6, 7, null, null, null, null, null, null, null, null));

        //when
        new TreeNodeUpdater().replaceWithSquareOfNthSuccessor(tree, 1);

        //then
        assertEquals(of(36, 25, 4, 1, 49, 9, 7), tree.preOrder());
    }

    @Test
    public void updateEachNodeWithItsNthSuccessorsSquare2() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, 6, 7, null, null, null, null, null, null, null, null));

        //when
        new TreeNodeUpdater().replaceWithSquareOfNthSuccessor(tree, 2);

        //then
        assertEquals(of(25, 1, 36, 9, 49, 3, 7), tree.inOrder());
    }
}