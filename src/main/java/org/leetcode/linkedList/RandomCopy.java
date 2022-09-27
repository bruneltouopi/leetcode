package org.leetcode.linkedList;

public class RandomCopy {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node dummyNode =null;
        while(head!=null){
            Node newNode=new Node(head.val);
            newNode.next = head.next;
            newNode.random = head.random;
            head = head.next;
            dummyNode = newNode;
        }

        return dummyNode;
    }
}
