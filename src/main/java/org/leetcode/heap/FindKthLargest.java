package org.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collector;

/**
 * @author bruno-fabrice touopi
 */
public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums= new int[]{3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>();
        for(int num:nums){
            maxHeap.add(num);
            if (maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        return maxHeap.poll();
    }
}
