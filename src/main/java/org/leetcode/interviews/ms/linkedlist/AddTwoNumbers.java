package org.leetcode.interviews.ms.linkedlist;

import org.leetcode.tree.ListNode;

import java.util.Arrays;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.setNext(new ListNode(4));
        head.getNext().setNext(new ListNode(3));
        ListNode head2 = new ListNode(5);
        head2.setNext(new ListNode(6));
        head2.getNext().setNext(new ListNode(4));
        System.out.println(add(head, new StringBuilder()));
        System.out.println(head.toString());
        System.out.println(addTwoNumbers(head, head2));
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(Character.getNumericValue(0));
        ListNode point = head;
        int sumL1 = Integer.parseInt(add(l1, new StringBuilder()));
        int sumL2 = Integer.parseInt(add(l2, new StringBuilder()));
        int sumTotal = sumL1 + sumL2;
        String toral = String.valueOf(sumTotal);
        System.out.println("total = " + toral);
        char[] sumChars = toral.toCharArray();
        for (int i = sumChars.length - 1; i >= 0; i--) {
                point.next=new ListNode(Character.getNumericValue(sumChars[i]));
                point = point.next;
        }
        return head.next;
    }

    public static String add(ListNode head, StringBuilder concat) {
        if (head == null) {
            return "";
        }
        concat.append(head.getVal());
        add(head.getNext(), concat);
        return concat.toString();
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.getVal() : 0;
            int y = (q != null) ? q.getVal() : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.setNext(new ListNode(sum % 10));
            curr = curr.getNext();
            if (p != null) p = p.getNext();
            if (q != null) q = q.getNext();
        }
        if (carry > 0) {
            curr.setNext(new ListNode(carry));
        }
        return dummyHead.getNext();
    }
}
