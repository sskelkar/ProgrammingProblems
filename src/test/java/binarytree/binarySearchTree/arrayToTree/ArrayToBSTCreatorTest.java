package binarytree.binarySearchTree.arrayToTree;

import binarytree.BinaryTree;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class ArrayToBSTCreatorTest {

    @Test
    public void convertSortedArrayToBST() {
        //given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        //when
        BinaryTree tree = new ArrayToBSTCreator().createFrom(array);

        //then
        assertEquals(asList(1, 2, 3, 4, 5, 6, 7, 8), tree.inOrder());
    }

    @Test
    public void convertSortedArrayToBST2() {
        //given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //when
        BinaryTree tree = new ArrayToBSTCreator().createFrom(array);

        //then
        assertEquals(asList(1, 2, 3, 4, 5, 6, 7, 8, 9), tree.inOrder());
    }
}