package numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerReverserTest {
    @Test
    public void reverseAnInteger() {
        assertEquals(786, new IntegerReverser().reverse(687));
        assertEquals(21, new IntegerReverser().reverse(1200));
        assertEquals(-21, new IntegerReverser().reverse(-1200));
    }

    @Test
    public void handleIntegerOverflowWhileReversing() {
        assertEquals(0, new IntegerReverser().reverse(2147483647));
        assertEquals(0, new IntegerReverser().reverse(-1146467285));
    }
}