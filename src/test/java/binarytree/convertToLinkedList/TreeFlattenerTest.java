package binarytree.convertToLinkedList;

import binarytree.BinaryTree;
import binarytree.Node;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TreeFlattenerTest {
    /*
     *        Tree:
     *                                    1
     *                                2       5
     *                            3      4        6
     *
     *      Expected linked list:
     *                                  1
     *                                     2
     *                                         3
     *                                             4
     *                                                 5
     *                                                     6
     */
    @Test
    public void flattenTreeToSinglyLinkedList() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 5, 3, 4, null, 6, null, null, null, null, null, null
        ));

        //when
        Node head = new TreeFlattener().flatten(tree);

        //then
        List<Integer> expectedOrder = asList(1, 2, 3, 4, 5, 6);
        Node curr = head;
        for (int i = 0; i < expectedOrder.size(); i++) {
            assertEquals(expectedOrder.get(i).intValue(), curr.data);
            assertNull(curr.left);
            curr = curr.right;
        }
    }
}