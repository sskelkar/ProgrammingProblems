package array;

import org.junit.Test;

import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static org.junit.Assert.assertEquals;

public class CombinationSumTest {

  @Test
  public void findAllUniqueCombinationsOfCandidatesThatSumToTarget() {
    List<List<Integer>> expected = of(of(1,1,1,1), of(1,1,2), of(2,2));
    assertEquals(expected, new CombinationSum().of(new int[]{1,2}, 4));
  }

  @Test
  public void findAllUniqueCombinationsOfCandidatesThatSumToTarget2() {
    List<List<Integer>> expected = of(of(2, 2, 3), of(7));
    assertEquals(expected, new CombinationSum().of(new int[]{2, 3, 6, 7}, 7));
  }

  @Test
  public void findAllUniqueCombinationsOfCandidatesThatSumToTarget3() {
    List<List<Integer>> expected = of(of(2, 2, 2, 2), of(2, 3, 3), of(3, 5));
    assertEquals(expected, new CombinationSum().of(new int[]{2, 3, 5}, 8));
  }

  @Test
  public void findAllUniqueCombinationsOfCandidatesThatSumToTarget4() {
    List<List<Integer>> expected = of();
    assertEquals(expected, new CombinationSum().of(new int[]{2}, 7));
  }
}