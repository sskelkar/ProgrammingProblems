package bit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOf1BitCounterTest {

  @Test
  public void countNoOf1BitsInUnsignedInteger() {
    assertEquals(3, new NumberOf1BitCounter().count(11L));
    assertEquals(0, new NumberOf1BitCounter().count(0L));
    assertEquals(2, new NumberOf1BitCounter().count(3L));
    assertEquals(32, new NumberOf1BitCounter().count(4294967295L));
  }
}