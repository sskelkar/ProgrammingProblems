package binarytree;

import org.junit.Test;

import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class BinaryTreeFlipperTest {

    @Test
    public void createBinaryTreeAsPerInput() {
        //given
        List<Integer> input = newArrayList(1, 2, 3, 4, null, 5, null, null, 6, null, null, null, null);

        //when
        BinaryTree tree = BinaryTree.from(input);

        //then
        assertEquals(of(4, 6, 2, 1, 5, 3), tree.inOrder());
        assertEquals(of(1, 2, 4, 6, 3, 5), tree.preOrder());
    }
}