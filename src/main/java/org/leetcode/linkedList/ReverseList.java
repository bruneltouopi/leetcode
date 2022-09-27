package org.leetcode.linkedList;

import org.leetcode.utils.ListNode;

public class ReverseList {

    public ListNode reverseList(ListNode head){

            ListNode dummyHead = head;
            while(head.next!=null){
                ListNode second =head.next;
                second.next = head;
                head = second;
            }
      return  dummyHead;
    }
}
