package codes.middleLinkedList;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MiddleLinkedList {

    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();

        ListNode node = head;

        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int middle = list.size()/2;
        return list.get(middle);
    }
}
