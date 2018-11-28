package array;

import org.junit.Test;

import static com.google.common.collect.ImmutableList.of;
import static org.junit.Assert.assertEquals;

public class ElementArrangerTest {

    @Test
    public void arrangeElementsToFormTheLargestPossibleNumber() {
        assertEquals("9534330", new ElementArranger().arrange(of(3, 30, 34, 5, 9)));
        assertEquals("6054854654", new ElementArranger().arrange(of(54, 546, 548, 60)));
        assertEquals("998764543431", new ElementArranger().arrange(of(1, 34, 3, 98, 9, 76, 45, 4)));
        assertEquals("99999999999998", new ElementArranger().arrange(of(9, 99, 999, 9999, 9998)));
        assertEquals("1010", new ElementArranger().arrange(of(10,10)));
        assertEquals("0", new ElementArranger().arrange(of(0,0,0)));
    }

    @Test
    public void testComparator() {
        assertEquals(1, ElementArranger.comparator.compare(1, 2));
        assertEquals(1, ElementArranger.comparator.compare(10, 2));
        assertEquals(1, ElementArranger.comparator.compare(546, 60));
        assertEquals(1, ElementArranger.comparator.compare(534, 53));
        assertEquals(-1, ElementArranger.comparator.compare(9999, 9998));
        assertEquals(-1, ElementArranger.comparator.compare(9, 998));
    }

}