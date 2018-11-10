package binarytree.binarySearchTree;

import binarytree.BinaryTree;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class BSTIteratorTest {
    @Test
    public void returnAnIteratorOverABST() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                8, 3, 10, 1, 6, null, 14, null, null, 4, 7, 13, null, null, null, null, null
        ));

        //when
        BSTIterator it = new BSTIterator(tree);

        //then
        List<Integer> expectedPreOrder = Lists.newArrayList(1, 3, 4, 6, 7, 8, 10, 13, 14);
        int count = 0;
        while (it.hasNext()) {
            assertEquals(expectedPreOrder.get(count++), it.next());
        }
        assertEquals(expectedPreOrder.size(), count);
    }
}