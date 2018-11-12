package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PreviousSmallestElementTest {
    @Test
    public void returnSmallestElementForEachArrayElementThatAppearedBeforeIt() {
        //given
        ArrayList<Integer> arr = Lists.newArrayList(4, 5, 2, 10, 8);

        //when
        ArrayList<Integer> result = new PreviousSmallestElement().find(arr);

        //then
        assertEquals(Lists.newArrayList(-1, 4, -1, 2, 2), result);
    }

    @Test
    public void returnSmallestElementForEachArrayElementThatAppearedBeforeIt2() {
        //given
        ArrayList<Integer> arr = Lists.newArrayList(5, 4, 3, 2, 1);

        //when
        ArrayList<Integer> result = new PreviousSmallestElement().find(arr);

        //then
        assertEquals(Lists.newArrayList(-1, -1, -1, -1, -1), result);
    }
}