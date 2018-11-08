package binarytree.pathSum;

import binarytree.BinaryTree;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class RootToLeafPathTest {

    @Test
    public void rootToLeafPathSumMatchesGivenNumber() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                10, 8, 2, 3, 5, 2, null, null, null, null, null, null, null));

        //then
        assertTrue(new RootToLeafPath().pathExistsWithSum(tree, 23));
        assertTrue(new RootToLeafPath().pathExistsWithSum(tree, 14));
        assertTrue(new RootToLeafPath().pathExistsWithSum(tree, 21));

        assertFalse(new RootToLeafPath().pathExistsWithSum(tree, 10));
        assertFalse(new RootToLeafPath().pathExistsWithSum(tree, 12));
        assertFalse(new RootToLeafPath().pathExistsWithSum(tree, 0));
    }

    @Test
    public void returnAllRootToLeafPathsWithSumEqualToGivenNumber() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                10, 8, 2, 3, 5, 2, null, null, null, null, null, null, null));

        //then
        List<List<Integer>> expectedPaths = asList(
                asList(10, 8, 5)
        );
        assertEquals(expectedPaths, new RootToLeafPath().pathsWithSum(tree, 23));
    }

    @Test
    public void returnAllRootToLeafPathsWithSumEqualToGivenNumber2() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1, null, null, null, null, null, null, null, null));

        //then
        List<List<Integer>> expectedPaths = asList(
                asList(5, 4, 11, 2),
                asList(5, 8, 4, 5)
        );
        assertEquals(expectedPaths, new RootToLeafPath().pathsWithSum(tree, 22));
    }

    @Test
    public void returnSumOfAllNumbersRepresentedByRootToLeafPath() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, null, null));

        //then
        assertEquals(25, new RootToLeafPath().sumOfAllNumbersRepresentedByRootToLeafPaths(tree) % 1003);
    }

    @Test
    public void returnSumOfAllNumbersRepresentedByRootToLeafPath3() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                1, 2, 3, 4, 5, null, 6, 7, 8, null, null, null, null, null, null, null, null));

        //then
        assertEquals(2756, new RootToLeafPath().sumOfAllNumbersRepresentedByRootToLeafPaths(tree));
    }

    @Test
    public void returnMaxPathSum() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                10, 30, 4, 20, 60, 1, 5, null, null, null, null, null, null, null, null));

        //then
        assertEquals(110, new RootToLeafPath().maxPathSum(tree));
    }

    @Test
    public void returnMaxPathSumWhenTreeHasNegativeNumbers() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                10, 2, 10, 20, 1, -1, -25, null, null, null, null, null, null, 3, 4, null, null, null, null));

        //then
        assertEquals(42, new RootToLeafPath().maxPathSum(tree));
    }

    @Test
    public void returnMaxPathSumWhenTreeHasNegativeNumbers2() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                10, -1, -2, null, null, null, null));

        //then
        assertEquals(10, new RootToLeafPath().maxPathSum(tree));
    }

    @Test
    public void returnPathWithMaximumSum() {
        //given
        BinaryTree tree = BinaryTree.from(newArrayList(
                10, 2, 10, 20, 1, -1, -25, null, null, null, null, null, null, 3, 4, null, null, null, null));

        //then
        assertEquals(asList(20, 2, 10, 10), new RootToLeafPath().pathWithMaxSum(tree));
    }
}