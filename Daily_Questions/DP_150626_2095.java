//Daily Question : 15/06/26
//2095. Delete the Middle Node of a Linked List
//Approach:1.  use two pointers a and b, where a moves one step at a time and b moves two steps at a time
//         2.  when b reaches the end of the list, a will be at the middle node



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
