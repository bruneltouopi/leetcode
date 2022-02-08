package org.leetcode.arrays;

import org.leetcode.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bruno-fabrice touopi
 */
public class ArrayLeetodeChapter {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        // Utils.printArrayInt(duplicateZeros(numbers));
    }

    public void duplicateZeros(int[] arr) {
        int zeroes = 0;
        for (int i : arr) {
            if (i == 0) {
                zeroes++;
            }
        }
        int i = arr.length - 1, j = arr.length + zeroes - 1;

        while (i != j) {
            insert(arr, i, j--);
            if (arr[i] == 0) {
                insert(arr, i, j--);
            }
            i--;
        }
    }

    private void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }

    /******MERGE *****/
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        int temp=0;
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
            for (int j = i+1; j <nums1.length ; j++) {
                if (nums1[i]>nums1[j]){
                    temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }

    }
}
