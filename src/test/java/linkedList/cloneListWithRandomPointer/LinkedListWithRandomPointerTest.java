package linkedList.cloneListWithRandomPointer;

import com.google.common.collect.Lists;
import linkedList.LinkedList;
import linkedList.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LinkedListWithRandomPointerTest {

    @Test
    public void cloneLinkedListWithRandomPointerInEachNode() {
        //given
        LinkedList ll = LinkedList.from(Lists.newArrayList(1, 2, 3, 4, 5, 6));
        ll.randomize();

        //when
        LinkedList cloned = new LinkedListWithRandomPointer().clone(ll);

        //then
        assertNotEquals(ll, cloned);
        verifyLinkedList(ll, cloned);
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