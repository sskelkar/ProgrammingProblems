package linkedList;

import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static linkedList.LinkedList.from;
import static org.junit.Assert.assertEquals;

public class PartiallyReverseTest {

  @Test
  public void partiallyReverseLinkedList() {
    //given
    LinkedList ll = from(newArrayList(1, 2, 3, 4, 5));

    //when
    LinkedList result = new PartiallyReverse().reverse(ll, 2, 4);

    //then
    verifyLinkedList(from(newArrayList(1, 4, 3, 2, 5)), result);
  }

  @Test
  public void partiallyReverseLinkedList2() {
    //given
    LinkedList ll = from(newArrayList(1, 2, 3, 4, 5));

    //when
    LinkedList result = new PartiallyReverse().reverse(ll, 2, 40);

    //then
    verifyLinkedList(from(newArrayList(1, 5, 4, 3, 2)), result);
  }

  @Test
  public void partiallyReverseLinkedList3() {
    //given
    LinkedList ll = from(newArrayList(1, 2, 3, 4, 5));

    //when
    LinkedList result = new PartiallyReverse().reverse(ll, 0, 4);

    //then
    verifyLinkedList(from(newArrayList(4, 3, 2, 1, 5)), result);
  }

  @Test
  public void partiallyReverseLinkedList4() {
    //given
    LinkedList ll = from(newArrayList(1, 2, 3, 4, 5));

    //when
    LinkedList result = new PartiallyReverse().reverse(ll, 0, 0);

    //then
    verifyLinkedList(from(newArrayList(1, 2, 3, 4, 5)), result);
  }

  @Test
  public void partiallyReverseLinkedList5() {
    //given
    LinkedList ll = from(newArrayList(1, 2, 3, 4, 5));

    //when
    LinkedList result = new PartiallyReverse().reverse(ll, 5, 5);

    //then
    verifyLinkedList(from(newArrayList(1, 2, 3, 4, 5)), result);
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