package org.leetcode.interviews.ms.linkedlist;

import org.leetcode.tree.ListNode;
import java.util.PriorityQueue;

public class MergeKLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        ListNode[] list = new ListNode[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;
        System.out.println(mergeKLists(list));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((e1, e2) -> e1.val - e2.val);
        for (ListNode l : lists) {
            queue.add(l);
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while (!queue.isEmpty()) {
            point.next = queue.poll();
            point = point.next;
            //pourquoi ceci
            ListNode next = point.next;
            if (next != null) {
                queue.add(next);
            }
        }

        return head.next;
    }
}
