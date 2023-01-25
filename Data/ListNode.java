package Data;

import java.util.Iterator;

public class ListNode implements Iterable<Integer> {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator() {
        ListNode node = this;
        return new ListNodeIterator(node);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        ListNode iterator = this;
        while (iterator != null) {
            builder.append(iterator.val);
            iterator = iterator.next;
            if (iterator != null) {
                builder.append(" -> ");
            }
        }

        builder.append("]");

        return builder.toString();
    }

    private static class ListNodeIterator implements Iterator<Integer> {
        private ListNode node;

        public ListNodeIterator(ListNode node) {
            this.node = node;
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public Integer next() {
            int toReturn = node.val;
            node = node.next;
            return toReturn;
        }
    }
}