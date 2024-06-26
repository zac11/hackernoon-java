package Youtube;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
/**
 * Given the head of a LinkedList, rotate it to the right by K places
 * head = [1,4,5,7,8,9], k=2 : Output : [8,9,1,4,5,7]
 * head = [0,1,2], k=4 : Output = [2,0,1]
 */
public class RotateLinkedList {
    public static ListNode rotateRightByKPlaces(ListNode head, int k){
        if(head == null || head.next == null || k==0){
            return head;
        }

        // Get the length of the list
        ListNode current = head;
        int length = 1;
        while(current.next !=null){
            current = current.next;
            length++;
        }
        current.next = head;

        // After rotation, find new head and tail
        k = k % length;
        int newHead = length -k;
        ListNode newTail  = current;
        while (newHead --> 0){
            newTail = newTail.next;

        }
        ListNode newListHead = newTail.next;
        newTail.next = null;
        return  newListHead;

    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);
        head1.next.next.next = new ListNode(7);
        head1.next.next.next.next = new ListNode(8);
        head1.next.next.next.next.next = new ListNode(9);
        int k1 = 2;
        ListNode result1 = rotateRightByKPlaces(head1, k1);
        printList(result1); // Output: [8, 9, 1, 4, 5, 7]

        // Test case 2
        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        int k2 = 4;
        ListNode result2 = rotateRightByKPlaces(head2, k2);
        printList(result2); // Output: [2, 0, 1]
    }

}
