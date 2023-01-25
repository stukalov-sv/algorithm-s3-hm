package Service;

import Data.ListNode;

public class ReverseListService {

    public static ListNode reverse(ListNode node) {
        ListNode reversedNode = null;

        while (node != null) {
            ListNode nextNode = node.next;
            node.next = reversedNode;
            reversedNode = node;
            node = nextNode;
        }
        return reversedNode;
    }
}
