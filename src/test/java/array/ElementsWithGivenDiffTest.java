package array;

import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ElementsWithGivenDiffTest {

    @Test
    public void checkIfElementsExistWithGivenDiff() {
        assertTrue(new ElementsWithGivenDiff().diffk(newArrayList(1, 3, 5), 4));
        assertTrue(new ElementsWithGivenDiff().diffk(newArrayList(2, 3, 5, 20, 50, 80), 78));
        assertFalse(new ElementsWithGivenDiff().diffk(newArrayList(20, 50, 70, 80, 90), 45));
        assertFalse(new ElementsWithGivenDiff().diffk(newArrayList(1, 2, 3), 0));
    }
}