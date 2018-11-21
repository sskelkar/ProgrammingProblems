package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.*;
import static org.junit.Assert.*;

public class SortZeroesOnesTwosTest {

    @Test
    public void sortAnArrayOfZeroesOnesAndTwos() {
        //given
        ArrayList<Integer> arr = newArrayList(0, 1, 2, 0, 1, 2);

        //when
        new SortZeroesOnesTwos().sort(arr);

        //then
        assertEquals(newArrayList(0, 0, 1, 1, 2, 2), arr);
    }

    @Test
    public void sortAnArrayOfZeroesOnesAndTwos2() {
        //given
        ArrayList<Integer> arr = newArrayList(0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1);

        //when
        new SortZeroesOnesTwos().sort(arr);

        //then
        assertEquals(newArrayList(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2), arr);
    }
}