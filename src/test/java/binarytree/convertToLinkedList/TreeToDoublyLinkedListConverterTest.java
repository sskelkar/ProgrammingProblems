package binarytree.convertToLinkedList;

import binarytree.BinaryTree;
import binarytree.Node;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class TreeToDoublyLinkedListConverterTest {

    @Test
    public void convertBinaryTreeToDoubleLikedListInPlace() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, 6, 7, null, null, null, null, null, null, null, null
        ));

        //when
        Node head = new TreeToDoublyLinkedListConverter().convertInPlace(tree);

        //then
        List<Integer> expectedOrder = asList(4, 2, 5, 1, 6, 3, 7);
        verifyDoublyLinkedList(head, expectedOrder);
    }

    @Test
    public void convertBinaryTreeToDoubleLikedListUsingList() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, 6, 7, null, null, null, null, null, null, null, null
        ));

        //when
        Node head = new TreeToDoublyLinkedListConverter().convertUsingList(tree);

        //then
        List<Integer> expectedOrder = asList(4, 2, 5, 1, 6, 3, 7);
        verifyDoublyLinkedList(head, expectedOrder);
    }

    private void verifyDoublyLinkedList(Node head, List<Integer> expectedOrder) {
        Node curr = head;
        for (int i = 0; i < expectedOrder.size(); i++) {
            assertEquals(expectedOrder.get(i).intValue(), curr.data);
            curr = curr.right;
        }

        curr = head;
        while (curr.right != null)
            curr = curr.right;
        for (int i = expectedOrder.size() - 1; i >= 0; i--) {
            assertEquals(expectedOrder.get(i).intValue(), curr.data);
            curr = curr.left;
        }
    }
}