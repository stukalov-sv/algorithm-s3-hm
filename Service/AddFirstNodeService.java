package Service;

import Data.ListNode;

public class AddFirstNodeService {
    static ListNode head;

    public static ListNode addFirst(int value) {
        ListNode node = new ListNode();
        node.val = value;
        node.next = head;
        head = node;
        return node;
    }
}
