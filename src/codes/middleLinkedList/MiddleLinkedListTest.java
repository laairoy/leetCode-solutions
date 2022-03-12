package codes.middleLinkedList;

public class MiddleLinkedListTest {
    public static void main(String[] args) {
        MiddleLinkedList middleLinkedList = new MiddleLinkedList();

        ListNode first = null;

        for(int i = 6; i > 0; i--) {
           first = new ListNode(i, first) ;
        }

        printLinkedList(first);

        ListNode middleNode = middleLinkedList.middleNode(first);

        printLinkedList(middleNode);

    }

    public static void printLinkedList(ListNode head) {
        System.out.print("{ ");
        for(ListNode node = head; node != null; node = node.next){
            System.out.print(node.val + ", ");
        }
        System.out.println("}");
    }
}
