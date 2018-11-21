package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class RemoveDuplicatesButAllowAtMost2Test {
    @Test
    public void removeDuplicatesElementInPlaceAndReturnNewLengthWhileAllowingAtLeast2Instances() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(1, 1, 2, 3, 3, 3, 4);

        //when
        int length = new RemoveDuplicatesButAllowAtMost2().remove(input);

        //then
        assertEquals(6, length);
        assertEquals(Lists.newArrayList(1, 1, 2, 3, 3, 4), input.subList(0, 6));
    }

    @Test
    public void removeDuplicatesElementInPlaceAndReturnNewLengthWhileAllowingAtLeast2Instances2() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(0);

        //when
        int length = new RemoveDuplicatesButAllowAtMost2().remove(input);

        //then
        assertEquals(1, length);
        assertEquals(Lists.newArrayList(0), input.subList(0, 1));
    }

    @Test
    public void removeDuplicatesElementInPlaceAndReturnNewLengthWhileAllowingAtLeast2Instances3() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(0,0,0,0,1,1,1,1);

        //when
        int length = new RemoveDuplicatesButAllowAtMost2().remove(input);

        //then
        assertEquals(4, length);
        assertEquals(Lists.newArrayList(0,0,1,1), input.subList(0, 4));
    }
}