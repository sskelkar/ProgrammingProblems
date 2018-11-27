package array;

import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class MinStepsInInfiniteGridTest {

    @Test
    public void minStepsRequiredToMoveBetween2DCoordinates() {
        //given
        ArrayList<Integer> x = newArrayList(0, 1, 1);
        ArrayList<Integer> y = newArrayList(0, 1, 2);

        //then
        assertEquals(2, new MinStepsInInfiniteGrid().steps(x, y));
    }
}