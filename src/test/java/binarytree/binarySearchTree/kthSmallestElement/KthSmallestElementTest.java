package binarytree.binarySearchTree.kthSmallestElement;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class KthSmallestElementTest {

    @Test
    public void findKthSmallestElement() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                20, 10, 25, 5, 15, null, 30, null, 8, 12, null, null, null, 6, null, null, null
        ));

        //then
        assertEquals(5, new KthSmallestElement().smallest(tree, 1));
        assertEquals(6, new KthSmallestElement().smallest(tree, 2));
        assertEquals(8, new KthSmallestElement().smallest(tree, 3));
        assertEquals(10, new KthSmallestElement().smallest(tree, 4));
        assertEquals(12, new KthSmallestElement().smallest(tree, 5));
        assertEquals(15, new KthSmallestElement().smallest(tree, 6));
        assertEquals(20, new KthSmallestElement().smallest(tree, 7));
        assertEquals(25, new KthSmallestElement().smallest(tree, 8));
        assertEquals(30, new KthSmallestElement().smallest(tree, 9));
    }
}