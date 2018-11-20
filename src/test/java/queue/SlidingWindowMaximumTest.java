package queue;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SlidingWindowMaximumTest {

    @Test
    public void findMaxNumberForEachWindowOfKElementsInAnArray() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(1, 3, -1, -3, 5, 3, 6, 7);

        //when
        ArrayList<Integer> maximums = new SlidingWindowMaximum().find(input, 3);

        //then
        assertEquals(Lists.newArrayList(3, 3, 5, 5, 6, 7), maximums);
    }

    @Test
    public void findMaxNumberForEachWindowOfKElementsInAnArray2() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(8, 5, 10, 7, 9, 4, 15, 12, 90, 13);

        //when
        ArrayList<Integer> maximums = new SlidingWindowMaximum().find(input, 4);

        //then
        assertEquals(Lists.newArrayList(10, 10, 10, 15, 15, 90, 90), maximums);
    }
}