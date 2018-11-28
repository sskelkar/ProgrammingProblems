package array;

import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class MaxContiguousSumSubArrayTest {

    @Test
    public void findMaxSumForAContiguousSubArray() {
        MaxContiguousSumSubArray maxSumFinder = new MaxContiguousSumSubArray();

        assertEquals(3, maxSumFinder.sum(newArrayList(-2, 0, 3)));
        assertEquals(6, maxSumFinder.sum(newArrayList(-2, 1, -3, 4, -1, 2, 1, -5, 4)));
        assertEquals(7, maxSumFinder.sum(newArrayList(-2, -3, 4, -1, -2, 1, 5, -3)));
        assertEquals(-1, maxSumFinder.sum(newArrayList(-2, -3, -4, -1, -2, -1, -5, -3)));
        assertEquals(9, maxSumFinder.sum(newArrayList(1, 5, 3)));
    }
}