package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayIntersectionTest {

    @Test
    public void returnCommonElementsInTwoSortedArrays() {
        //given
        ArrayList<Integer> list1 = Lists.newArrayList(1, 2, 3, 3, 4, 5, 6);
        ArrayList<Integer> list2 = Lists.newArrayList(3, 3, 5);

        //when
        ArrayList<Integer> result = new ArrayIntersection().intersection(list1, list2);

        //then
        assertEquals(Lists.newArrayList(3, 3, 5), result);
    }

    @Test
    public void returnCommonElementsInTwoSortedArrays2() {
        //given
        ArrayList<Integer> list1 = Lists.newArrayList(1, 2, 3, 3, 4, 5, 6);
        ArrayList<Integer> list2 = Lists.newArrayList(3, 5);

        //when
        ArrayList<Integer> result = new ArrayIntersection().intersection(list1, list2);

        //then
        assertEquals(Lists.newArrayList(3, 5), result);
    }
}