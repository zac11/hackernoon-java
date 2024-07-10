package Microsoft;

import java.util.List;

class ListNode{
int val;
ListNode next;
ListNode(){};
ListNode(int val){
    this.val = val;
}
ListNode(int val, ListNode next){
    this.val = val;
    this.next = next;
    }
}

/**
 *
 */
public class TwoSumProblem {
    public ListNode addTwoSumProblem(ListNode l1, ListNode l2){
        ListNode dummyhead = new ListNode(0);
        ListNode current = dummyhead;
        int carry = 0;
        while(l1 != null || l2 !=null || carry !=0){
            int x = (l1 !=null) ? l1.val : 0;
            int y = (l2 !=null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum/10;
            current.next = new ListNode(sum %10);
            current = current.next;

            if(l1 !=null) l1 = l1.next;
            if(l2 !=null) l2 = l2.next;
        }

        return dummyhead.next;

    }
    public static ListNode createLinkedList(int [] arr){
        ListNode dummyhead = new ListNode(0);
        ListNode current = dummyhead;
        for (int num : arr){
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummyhead.next;
    }

    public static void main(String [] args){
        int[] arr1 = {9, 9, 9, 9, 9, 9, 9};
        int[] arr2 = {9, 9, 9, 9};
        ListNode l1 = createLinkedList(arr1);
        ListNode l2 = createLinkedList(arr2);

        TwoSumProblem tw = new TwoSumProblem();
        ListNode result = tw.addTwoSumProblem(l1,l2);

        while(result!= null){
            System.out.print(result.val + "->");
            result = result.next;
        }
    }
}
