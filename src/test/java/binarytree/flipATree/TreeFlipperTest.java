package binarytree.flipATree;

import binarytree.BinaryTree;
import com.google.common.collect.Lists;
import org.junit.Test;

import static com.google.common.collect.ImmutableList.of;
import static org.junit.Assert.assertEquals;

public class TreeFlipperTest {

    @Test
    public void shouldConvertATreeToItsMirrorImage() {
        //given
        BinaryTree tree = BinaryTree.from(Lists.newArrayList(1, 2, 3, 4, null, 5, null, null, 6, null, null, null, null));

        //when
        new TreeFlipper().flip(tree);

        //then
        assertEquals(of(1, 3, 5, 2, 4, 6), tree.preOrder());
    }
}