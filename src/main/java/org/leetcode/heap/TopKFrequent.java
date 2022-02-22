package org.leetcode.heap;

import org.leetcode.utils.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.SortedMap;

/**
 * @author bruno-fabrice touopi
 */
public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums= new int[]{1,1,1,2,2,3};
        Utils.printArrayInt(topKFrequent(nums,2));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int num: nums) {
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> maxheap = new PriorityQueue<>((o1, o2) -> o1.getValue()-o2.getValue());
        countMap.entrySet().stream().forEach(entry -> {
            maxheap.add(entry);
            if (maxheap.size() > k) {
                maxheap.poll();
            }
        });
        int[] results = new int[k];
        for (int i = k-1; i >=0; i--) {
            results[i] = maxheap.poll().getKey();
        }

        return results;
    }


}


