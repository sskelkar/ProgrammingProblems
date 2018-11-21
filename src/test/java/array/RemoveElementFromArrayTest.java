package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RemoveElementFromArrayTest {
    @Test
    public void removeElementFromAnArray() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(4, 1, 1, 2, 1, 3);

        //when
        int length = new RemoveElementFromArray().remove(input, 1);

        //then
        assertEquals(3, length);
        assertEquals(Lists.newArrayList(4, 2, 3), input.subList(0, length));
    }
}