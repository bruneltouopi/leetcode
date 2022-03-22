package org.leetcode.recursion;

import org.leetcode.tree.ListNode;

/**
 * @author bruno-fabrice touopi
 */
public class ReverseList {

    //recursion solution
    public ListNode reverseList(ListNode head) {
        if (head == null || head.getNext() == null) return head;
        ListNode p = reverseList(head.getNext());
        head.getNext().getNext().setNext(head);
        head.setNext(null);
        return p;
    }

    //iteration solution
    public ListNode reverseList2(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode tempNode = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = tempNode;
        }
        return prev;
    }
}
