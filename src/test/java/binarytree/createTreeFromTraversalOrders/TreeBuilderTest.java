package binarytree.createTreeFromTraversalOrders;

import binarytree.BinaryTree;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TreeBuilderTest {

    @Test
    public void constructTreeFromInorderAndPostorderTraversals() {
        //given
        List<Integer> inOrder = Lists.newArrayList(4, 2, 1, 5, 3, 6);
        List<Integer> postOrder = Lists.newArrayList(4, 2, 5, 6, 3, 1);

        //when
        BinaryTree tree = new TreeBuilder().fromInorderAndPostorder(inOrder, postOrder);

        //then
        assertEquals(inOrder, tree.inOrder());
        assertEquals(postOrder, tree.postOrder());
    }

    @Test
    public void constructTreeFromInorderAndPostorderTraversals2() {
        //given
        List<Integer> inOrder = Lists.newArrayList(1, 2, 3);
        List<Integer> postOrder = Lists.newArrayList(3, 2, 1);

        //when
        BinaryTree tree = new TreeBuilder().fromInorderAndPostorder(inOrder, postOrder);

        //then
        assertEquals(inOrder, tree.inOrder());
        assertEquals(postOrder, tree.postOrder());
    }

    @Test
    public void constructTreeFromInorderAndPostorderTraversals3() {
        //given
        List<Integer> inOrder = Lists.newArrayList(7, 4, 2, 1, 5, 3, 6, 8);
        List<Integer> postOrder = Lists.newArrayList(7, 4, 2, 5, 8, 6, 3, 1);

        //when
        BinaryTree tree = new TreeBuilder().fromInorderAndPostorder(inOrder, postOrder);

        //then
        assertEquals(inOrder, tree.inOrder());
        assertEquals(postOrder, tree.postOrder());
    }
}