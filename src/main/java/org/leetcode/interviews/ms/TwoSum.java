package org.leetcode.interviews.ms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bruno-fabrice touopi
 */
public class TwoSum {

    //brute force
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> mapValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int valueToFind = target - nums[i];
            if (mapValues.containsKey(valueToFind) && mapValues.get(valueToFind) != i) {
                return new int[]{i, mapValues.get(valueToFind)};
            }
            mapValues.put(nums[i], i);
        }
        return null;
    }


}
