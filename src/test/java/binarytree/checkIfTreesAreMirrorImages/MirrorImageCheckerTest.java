package binarytree.checkIfTreesAreMirrorImages;

import binarytree.BinaryTree;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.*;

public class MirrorImageCheckerTest {

    @Test
    public void checkIfGivenTreesAreMirrorImages() {
        //given
        BinaryTree tree1 = BinaryTree.from(newArrayList(1, 2, 3, 4, null, 5, null, null, 6, null, null, null, null));
        BinaryTree tree2 = BinaryTree.from(newArrayList(1, 3, 2, null, 5, null, 4, null, null, 6, null, null, null));

        //then
        assertTrue(new MirrorImageChecker().areMirrors(tree1, tree2));
    }

    @Test
    public void checkIfGivenTreesAreMirrorImages2() {
        //given
        BinaryTree tree1 = BinaryTree.from(newArrayList(1, 2, 3, null, null, null, null));
        BinaryTree tree2 = BinaryTree.from(newArrayList(1, 2, 2, null, null, null, null));

        //then
        assertFalse(new MirrorImageChecker().areMirrors(tree1, tree2));
    }

    @Test
    public void checkIfGivenTreesAreMirrorImages3() {
        //given
        BinaryTree tree1 = BinaryTree.from(newArrayList(1, 2, 3, 4, null, 5, null, null, 6, null, null, null, null));
        BinaryTree tree2 = BinaryTree.from(newArrayList(1, 3, 2, null, 5, null, 4, null, null, null, null));

        //then
        assertFalse(new MirrorImageChecker().areMirrors(tree1, tree2));
    }
}