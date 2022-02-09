package org.leetcode.arrays;

/**
 * @author bruno-fabrice touopi
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int indexToInsert = 0;
        for (int readIndex=0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex]!=0){
                nums[indexToInsert] = nums[readIndex];
                indexToInsert++;
            }
        }
        for(int i=indexToInsert;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
