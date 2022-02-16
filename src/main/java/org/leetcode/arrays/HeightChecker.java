package org.leetcode.arrays;

/**
 * @author bruno-fabrice touopi
 */
public class HeightChecker {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
    }
    public static int heightChecker(int[] heights) {
        int k=0;
        int temp=0;
        for (int i = 0; i < heights.length-1; i++) {
            if(heights[k]>heights[i+1]){
                temp=heights[k];
                heights[k]=heights[i+1];
                heights[i+1] = temp;
                k++;
            }else{
                k=i;
            }
        }
        return k;
    }
}
