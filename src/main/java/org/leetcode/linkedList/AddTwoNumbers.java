package org.leetcode.linkedList;

public class AddTwoNumbers {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum = result.val + l1.val + l2.val;
            if (sum > 9) {
                result.val = sum % 10;
                result.next.val += sum/10;
            } else {
                result.val = sum;
            }
            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }
        return result;
    }
}
