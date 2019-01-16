package linkedList;

import com.google.common.collect.Lists;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static linkedList.LinkedList.from;
import static org.junit.Assert.*;

public class NumberRepresentedAsLLTest {

  @Test
  public void findSumOfNumbersAsLL() {
    //given
    LinkedList one = from(newArrayList(3, 4, 2));
    LinkedList two = from(newArrayList(5, 6, 4, 1, 3));

    //when
    LinkedList sum = new NumberRepresentedAsLL().sum(one, two);

    //then
    verifyLinkedList(from(newArrayList(8, 0, 7, 1, 3)), sum);
  }

  @Test
  public void findSumOfNumbersAsLL2() {
    //given
    LinkedList one = from(newArrayList(3, 4, 2));
    LinkedList two = from(newArrayList());

    //when
    LinkedList sum = new NumberRepresentedAsLL().sum(one, two);

    //then
    verifyLinkedList(from(newArrayList(3,4,2)), sum);
  }

  @Test
  public void findSumOfNumbersAsLL3() {
    //given
    LinkedList one = from(newArrayList(3));
    LinkedList two = from(newArrayList(9));

    //when
    LinkedList sum = new NumberRepresentedAsLL().sum(one, two);

    //then
    verifyLinkedList(from(newArrayList(2,1)), sum);
  }

  @Test
  public void findSumOfNumbersAsLL4() {
    //given
    LinkedList one = from(newArrayList(9,8));
    LinkedList two = from(newArrayList(1));

    //when
    LinkedList sum = new NumberRepresentedAsLL().sum(one, two);

    //then
    verifyLinkedList(from(newArrayList(0,9)), sum);
  }

  private void verifyLinkedList(LinkedList expected, LinkedList actual) {
    assertEquals(expected.size(), actual.size());
    Node e = expected.getHead();
    Node a = actual.getHead();

    while (e != null) {
      assertEquals(e.data, a.data);
      assertEquals(e.next, a.next);
      assertEquals(e.rand, a.rand);
      e = e.next;
      a = a.next;
    }
  }
}