package org.leetcode.arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        //hsve the current position
        // look the last identic position and permut with the current position +1
        //the meove to ieration from the element permute
        int i=1;
        int j=i;

        while(j<nums.length){
            if(nums[i-1]==nums[j]){
                j++;
            }else{
                nums[i]=nums[j];
                i++;
            }
        }
        return i;

    }
}
