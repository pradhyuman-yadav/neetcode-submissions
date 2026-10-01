/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = new ListNode(head.val);
        ListNode rev = new ListNode();

        while(head.next != null) {
            rev = new ListNode(head.next.val);
            rev.next = prev;
            prev = rev;
            head = head.next;
        }
        return rev;
    }
}
