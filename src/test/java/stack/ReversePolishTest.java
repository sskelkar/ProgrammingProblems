package stack;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReversePolishTest {

    @Test
    public void evaluateTheExpressionGivenInReversePolish() {
        //given
        ArrayList<String> expression = Lists.newArrayList("2", "1", "+", "3", "*");

        //when
        int result = new ReversePolish().evaluate(expression);

        //then
        assertEquals(9, result);
    }

    @Test
    public void evaluateTheExpressionGivenInReversePolish2() {
        //given
        ArrayList<String> expression = Lists.newArrayList("5", "13", "5", "/", "-");

        //when
        int result = new ReversePolish().evaluate(expression);

        //then
        assertEquals(3, result);
    }

    @Test
    public void evaluateTheExpressionGivenInReversePolish3() {
        //given
        ArrayList<String> expression = Lists.newArrayList("2", "2", "/");

        //when
        int result = new ReversePolish().evaluate(expression);

        //then
        assertEquals(1, result);
    }
}