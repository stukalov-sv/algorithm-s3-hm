package Service;

import Data.ListNode;

public class RemoveFirstNodeService {

    public static ListNode removeFirst(ListNode node) {
        if (node != null) {
            node = node.next;
            return node;
        } else {
            System.out.println("Null list");
        }
        return null;
    }
}
