package linkedList;

public class PartiallyReverse {
  public LinkedList reverse(LinkedList ll, int m, int n) {
    Node beforeFirst = null;
    Node first = ll.getHead();
    Node last = first;
    if (m < 1)
      m = 1;
    int reverseLength = n - m;
    while (m > 1) {
      beforeFirst = first;
      first = first.next;
      last = last.next;
      m--;
    }

    while (reverseLength > 0 && last.next != null) {
      last = last.next;
      reverseLength--;
    }
    Node prev = last.next;

    Node curr = first;
    Node next = curr.next;
    while (next != last.next) {
      curr.next = prev;
      prev = curr;
      curr = next;
      next = next.next;
    }
    curr.next = prev;

    if (beforeFirst == null)
      return new LinkedList(last);
    else
      beforeFirst.next = last;
    return ll;
  }
}
