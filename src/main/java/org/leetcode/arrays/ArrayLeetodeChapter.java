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
        int[] numbers=new int[]{1,0,2,3,0,4,5,0};
        Utils.printArrayInt(duplicateZeros(numbers));
    }

    public static int[] duplicateZeros(int[] arr) {
       int[] result=new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++,j++) {
            if (arr[i] == 0 && i < arr.length - 1) {
                result[j]=arr[i];
                j++;
                result[j]=arr[i];
            } else if (arr[i] == 0 && i == arr.length - 1 || j== arr.length) {
                break;
            } else {
                result[j]=arr[i];
            }
        }
        arr=result;
        return arr;
    }
}
