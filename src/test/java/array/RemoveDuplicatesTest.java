package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void removeDuplicatesElementInPlaceAndReturnNewLength() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(1, 1, 2, 3, 3, 3, 4);

        //when
        int length = new RemoveDuplicates().remove(input);

        //then
        assertEquals(4, length);
        assertEquals(Lists.newArrayList(1, 2, 3, 4), input.subList(0, 4));
    }
}