package org.leetcode.arrays;

import org.leetcode.utils.Utils;

import java.util.Arrays;

/**
 * @author bruno-fabrice touopi
 */
public class ShiftElements {
    public static void main(String[] args) {
        int[] numbers = new int[]{10,5,8,8};

        Utils.printArrayInt(shiftElements(numbers,3,2));


    }

    public static int[] shiftElements(int[] num,int element,int position){
        int[] movedArray=new int[num.length+1];
        if(position > num.length){
            throw new RuntimeException("please enter a position that is less than length"+num.length);
        }
        for(int i=movedArray.length-1;i>=position;i--){
            movedArray[i+1]=num[i];
        }
        movedArray[position]=element;
        return movedArray;
    }
}
