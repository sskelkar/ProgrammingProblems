package array;

import org.junit.Test;

import static com.google.common.collect.ImmutableList.of;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class DuplicateFinderTest {

    @Test
    public void findADuplicatedNumberInAnEditableArrayOf1ToN() {
        assertEquals(4, new DuplicateFinder().findInEditableList(asList(3, 4, 1, 4, 1)));
        assertEquals(3, new DuplicateFinder().findInEditableList(asList(5, 4, 3, 2, 3, 1)));
        assertEquals(-1, new DuplicateFinder().findInEditableList(asList(5, 4, 3, 2, 1, 0)));
    }

    @Test
    public void findADuplicatedNumberInAnUnEditableArrayOf1ToN() {
        assertEquals(4, new DuplicateFinder().findInUnEditableList(of(3, 4, 1, 4, 1)));
        assertEquals(3, new DuplicateFinder().findInUnEditableList(of(5, 4, 3, 2, 3, 1)));
        assertEquals(-1, new DuplicateFinder().findInUnEditableList(of(5, 4, 3, 2, 1, 0)));
    }
}