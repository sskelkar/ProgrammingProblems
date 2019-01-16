package array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

  @Test
  public void findIndicesOfElementsWhoseSumIsTarget() {
    int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
    assertEquals(0, result[0]);
    assertEquals(1, result[1]);
  }

  @Test
  public void findIndicesOfElementsWhoseSumIsTarget2() {
    int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 90);
    assertEquals(0, result.length);
  }

  @Test
  public void findIndicesOfElementsWhoseSumIsTarget3() {
    int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15, 6, 4, 8}, 10);
    assertEquals(4, result[0]);
    assertEquals(5, result[1]);
  }
}