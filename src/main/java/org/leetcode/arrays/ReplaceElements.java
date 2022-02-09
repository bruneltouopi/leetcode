package org.leetcode.arrays;

/**
 * @author bruno-fabrice touopi
 */
public class ReplaceElements {

    public int[] replaceElements(int[] arr) {
        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = -1;
            } else {
                greatest = arr[i + 1];
                for (int j = i + 1; j < arr.length ; j++) {

                    if (arr[j] > greatest) {
                        greatest = arr[j];
                    }
                }
                arr[i] = greatest;
            }

        }
        return arr;

    }
}
