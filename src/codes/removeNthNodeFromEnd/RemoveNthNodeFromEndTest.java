package codes.removeNthNodeFromEnd;

public class RemoveNthNodeFromEndTest {
    public static void main(String[] args) {
        ListNode first = null;

        for (int i = 1; i > 0; i--) {
            first = new ListNode(i, first);
        }
        printLinkedList(first);

        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();

        ListNode res = removeNthNodeFromEnd.removeNthFromEnd(first, 1);

        printLinkedList(res);

    }

    public static void printLinkedList(ListNode head) {
        System.out.print("{ ");
        for (ListNode node = head; node != null; node = node.next) {
            System.out.print(node.val + ", ");
        }
        System.out.println("}");
    }
}
