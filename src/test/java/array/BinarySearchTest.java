package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void searchNumberInASortedArray() {
        //given
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //then
        assertEquals(7, new BinarySearch().search(arr, 80));
        assertEquals(1, new BinarySearch().search(arr, 20));
        assertEquals(4, new BinarySearch().search(arr, 50));
        assertEquals(9, new BinarySearch().search(arr, 100));
        assertEquals(-1, new BinarySearch().search(arr, 101));
    }
}