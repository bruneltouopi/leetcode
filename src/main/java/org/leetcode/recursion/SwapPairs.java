package org.leetcode.recursion;

import org.leetcode.tree.ListNode;

/**
 * @author bruno-fabrice touopi
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode firstHead = head;
        ListNode secondHead = head.getNext();
        firstHead.setNext(swapPairs(secondHead.getNext()));
        secondHead.setNext(firstHead);
        return secondHead;
    }
}
