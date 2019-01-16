package linkedList;

public class NumberRepresentedAsLL {
  public LinkedList sum(LinkedList one, LinkedList two) {
    Node a = one.getHead();
    Node b = two.getHead();
    Node head = new Node(-1);
    Node prev = head;
    int carry = 0;
    while (!(a == null && b == null)) {
      int sum = getVal(a) + getVal(b) + carry;
      carry = sum / 10;
      prev.next = new Node(sum % 10);
      prev = prev.next;
      a = getNext(a);
      b = getNext(b);
    }

    if (carry > 0) {
      prev.next = new Node(carry);
    }

    return new LinkedList(head.next);
  }

  private int getVal(Node n) {
    return n == null ? 0 : n.data;
  }

  private Node getNext(Node n) {
    return n == null ? null : n.next;
  }
}
