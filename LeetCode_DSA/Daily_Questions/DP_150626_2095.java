//Daily Question : 15/06/26
//2095. Delete the Middle Node of a Linked List
//Approach:1.  use two pointers a and b, where a moves one step at a time and b moves two steps at a time
//         2.  when b reaches the end of the list, a will be at the middle node
//         3.  keep track of the previous node of a, so that we can delete the middle node by changing the next pointer of the previous node to the next pointer of a
//         4.  return the head of the modified linked list
//         5.  Time Complexity: O(n) as we are traversing the linked list once
//         6.  Space Complexity: O(1) as we are not using any   




package Daily_Questions;

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if((head==null)||(head.next==null)){
            return null;
        }
        ListNode a = head;
        ListNode b = head;
        ListNode prev = null;
        while((b!=null)&&(b.next!=null)){
            prev = a;
            a=a.next;
            b=b.next.next;
        }
        prev.next=a.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
