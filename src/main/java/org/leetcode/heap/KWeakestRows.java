package org.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KWeakestRows {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>
                ((o1, o2) -> {
                    if (o1.getValue() - o2.getValue() == 0) {
                        return o1.getKey() - o2.getKey();
                    }
                    return o1.getValue() - o2.getValue();
                });
        Map<Integer, Integer> map = new HashMap<>();
        //sum each row of matrix and put it the heap
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            map.put(i, sum);
        }
        map.entrySet().forEach(heap::add);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll().getKey();
        }
        return result;

    }
}
