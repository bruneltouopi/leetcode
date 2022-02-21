package org.leetcode.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] nums=new int[]{2,2};
        System.out.println(lastStoneWeight(nums));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int first = 0;
        int second = 0;
        for (int s : stones) {
            heap.add(s);
        }
        while (heap.size() > 1) {
            first = heap.poll();
            second = heap.poll();
            if (first != second) {
                heap.add(first - second);
            }
        }

        return heap.size() == 0 ? 0 : heap.peek();
    }
}
