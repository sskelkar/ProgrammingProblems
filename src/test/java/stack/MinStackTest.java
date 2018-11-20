package stack;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MinStackTest {
    @Test
    public void stackShouldReturnMinimumElement() {
        //given
        ArrayList<Integer> input = Lists.newArrayList(4,7,0,9,-1,6);

        //when
        MinStack stack = MinStack.from(input);

        //then
        assertEquals(-1, stack.getMin());
        assertEquals(6, stack.top());
        stack.pop();
        stack.pop();
        assertEquals(0, stack.getMin());
        assertEquals(9, stack.top());
        stack.pop();
        stack.pop();
        assertEquals(4, stack.getMin());
        assertEquals(7, stack.top());
        stack.pop();
        stack.pop();
        assertEquals(-1, stack.getMin());
        assertEquals(-1, stack.top());
    }
}