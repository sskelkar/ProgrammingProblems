package binarytree.leastCommonAncestor;

import binarytree.BinaryTree;
import com.google.common.collect.Lists;
import org.junit.Test;

import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class LeastCommonAncestorFinderTest {

    @Test
    public void findLeastCommonAncestor() {
        //given
        BinaryTree tree = BinaryTree.from(Lists.newArrayList(1, 2, 3, 4, 5, null, null, null, null, null, 6, null, null));

        //then
        assertEquals(2, new LeastCommonAncestorFinder().find(tree, 4, 6));
        assertEquals(5, new LeastCommonAncestorFinder().find(tree, 5, 6));
        assertEquals(1, new LeastCommonAncestorFinder().find(tree, 3, 6));
        assertEquals(1, new LeastCommonAncestorFinder().find(tree, 3, 5));
        assertEquals(6, new LeastCommonAncestorFinder().find(tree, 6, 6));
        assertEquals(1, new LeastCommonAncestorFinder().find(tree, 4, 1));
    }

    @Test
    public void whenEitherNumberIsNotPresentInTree() {
        //given
        BinaryTree tree = BinaryTree.from(Lists.newArrayList(1, 2, 3, 4, 5, null, null, null, null, null, 6, null, null));

        //then
        assertEquals(MIN_VALUE, new LeastCommonAncestorFinder().find(tree, 40, 60));
        assertEquals(MIN_VALUE, new LeastCommonAncestorFinder().find(tree, 40, 6));
        assertEquals(MIN_VALUE, new LeastCommonAncestorFinder().find(tree, 4, 16));
        assertEquals(MIN_VALUE, new LeastCommonAncestorFinder().find(tree, 0, 0));
    }
}