package codes.removeNthNodeFromEnd;

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

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();

        ListNode node = head;

        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int index = list.size() - n;

        if(index == 0) {
            head = head != null ? head.next : null;
        } else {
            list.get(index-1).next = list.get(index).next;
        }

        return head;
    }
}
