package binarytree.populateNextRightPointer;

import binarytree.BinaryTree;
import binarytree.Node;
import org.junit.Test;

import java.util.LinkedList;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.newLinkedList;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PopulateNextRightPointerTest {

    @Test
    public void populateNextRightPointerInEachNode() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, 6, 7, null, null, null, null, null, null, null, null
        ));

        //when
        new PopulateNextRightPointer().populate(tree);

        //then
        LinkedList<Integer> expectedNextInInorderTraversal = newLinkedList(newArrayList(5, 3, 6, MIN_VALUE, 7, MIN_VALUE, MIN_VALUE));
        verifyRightPointer(tree.getRoot(), expectedNextInInorderTraversal);
    }

    private void verifyRightPointer(Node curr, LinkedList<Integer> expectedNextInInorderTraversal) {
        if (curr == null) return;
        verifyRightPointer(curr.left, expectedNextInInorderTraversal);
        Integer expected = expectedNextInInorderTraversal.getFirst();
        if (expected == MIN_VALUE)
            assertNull(curr.next);
        else
            assertEquals(expected.intValue(), curr.next.data);
        expectedNextInInorderTraversal.remove();
        verifyRightPointer(curr.right, expectedNextInInorderTraversal);
    }
}