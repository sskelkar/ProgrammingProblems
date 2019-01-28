package array;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinarySearchForRangeTest {

  @Test
  public void findStartAndEndIndexOfANumberInSortedArray() {
    //given
    List<Integer> arr = Lists.newArrayList(5, 7, 7, 8, 8, 11);

    List<Integer> range = new BinarySearchForRange().search(arr, 8);

    assertEquals(Lists.newArrayList(3, 4), range);
  }
}