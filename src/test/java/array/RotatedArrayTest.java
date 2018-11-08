package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotatedArrayTest {

    @Test
    public void searchInRotatedSortedArray() {
        //given
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        //when
        int index = new RotatedArray().search(arr, 8);

        //then
        assertEquals(3, index);
    }

    @Test
    public void searchInRotatedSortedArray2() {
        //given
        int[] arr = {9, 10, 1, 2, 3, 5, 6, 7, 8};

        //when
        int index = new RotatedArray().search(arr, 3);

        //then
        assertEquals(4, index);
    }

    @Test
    public void searchInSortedArray() {
        //given
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};

        //when
        int index = new RotatedArray().search(arr, 8);

        //then
        assertEquals(6, index);
    }
}