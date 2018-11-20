package stack;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LargestRectangleInHistogramTest {

    @Test
    public void areaOfLargestRectangleInHistogramOfNonNegativeNumbersAndWidthOne() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(6, 2, 5, 4, 5, 1, 6);

        //then
        assertEquals(12, new LargestRectangleInHistogram().calculateArea(input));
    }

    @Test
    public void areaOfLargestRectangleInHistogramOfNonNegativeNumbersAndWidthOne2() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(6, 2, 5, 4, 5, 2, 6);

        //then
        assertEquals(14, new LargestRectangleInHistogram().calculateArea(input));
    }

    @Test
    public void areaOfLargestRectangleInHistogramOfNonNegativeNumbersAndWidthOne3() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(1, 1, 1);

        //then
        assertEquals(3, new LargestRectangleInHistogram().calculateArea(input));
    }
}