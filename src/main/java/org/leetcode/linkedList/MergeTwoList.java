package org.leetcode.linkedList;

public class MergeTwoList {

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

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p=list1,q=list2,curr=dummyHead;
            int min = 0;
            while(p!=null || q!=null){
                if(p!=null && q!=null){
                    min = Math.min(p.val,q.val);
                }else if(p!=null){
                    min = p.val;
                }else{
                    min = q.val;
                }
                curr.next = new ListNode(min);
                curr = curr.next;
                if(p!=null && p.val == min){
                    p = p.next;
                }else {
                    q = q.next;
                }
            }
            return dummyHead.next;
        }
}
