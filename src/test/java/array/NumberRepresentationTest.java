package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

public class NumberRepresentationTest {

    @Test
    public void addNumberToANumberRepresentedAsArray() {
        //given
        ArrayList<Integer> input = newArrayList(9, 9, 9);

        //when
        ArrayList<Integer> result = new NumberRepresentation().add(input, 1);

        //then
        assertEquals(newArrayList(1, 0, 0, 0), result);
    }

    @Test
    public void addNumberToANumberRepresentedAsArray2() {
        //given
        ArrayList<Integer> arr = Lists.newArrayList(0, 1, 2, 3);

        //when
        ArrayList<Integer> result = new NumberRepresentation().add(arr, 1);

        //then
        assertEquals(newArrayList(1, 2, 4), result);
    }

    @Test
    public void addNumberToANumberRepresentedAsArray3() {
        //given
        ArrayList<Integer> arr = Lists.newArrayList(1, 2, 3);

        //when
        ArrayList<Integer> result = new NumberRepresentation().add(arr, 1);

        //then
        assertEquals(newArrayList(1, 2, 4), result);
    }

    @Test
    public void addNumberToANumberRepresentedAsArray4() {
        //given
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);

        //when
        ArrayList<Integer> result = new NumberRepresentation().add(arr, 1);

        //then
        assertEquals(newArrayList(1), result);
    }

    @Test
    public void addNumberToANumberRepresentedAsArray5() {
        //given
        ArrayList<Integer> arr = Lists.newArrayList(0, 6, 0, 6, 4, 8, 8, 1);

        //when
        ArrayList<Integer> result = new NumberRepresentation().add(arr, 1);

        //then
        assertEquals(newArrayList(6, 0, 6, 4, 8, 8, 2), result);
    }
}