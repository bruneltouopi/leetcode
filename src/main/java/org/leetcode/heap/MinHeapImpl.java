package org.leetcode.heap;

import java.util.PriorityQueue;

/**
 * @author bruno-fabrice touopi
 */
public class MinHeapImpl {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //add values in the min heap
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(2);

        System.out.println(minHeap.toString());

        //get the top element
        int peekNum = minHeap.peek();
        System.out.println("peek number :"+peekNum);

        //delete the top element
        int pollNumber = minHeap.poll();
        System.out.println("pool number :"+pollNumber);

        //check after deleting the top element that is 2
        System.out.println("new peek Number is "+minHeap.peek());
        System.out.println(minHeap.toString());

        //get the size of the min heap
        int heapSize = minHeap.size();
        System.out.println("minheap Size:"+heapSize);
        // check if it is empty
        boolean isEmpty = minHeap.isEmpty();
        System.out.println("isEmpty :"+isEmpty);


    }
}
