package org.leetcode.queue;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author bruno-fabrice touopi
 */
public class MovingAverage {

    ArrayList<Integer> valuesAverages;
    int size;
    public MovingAverage(int size) {
        valuesAverages=new ArrayList<>();
        this.size=size;
    }

    public double next(int val) {
        valuesAverages.add(val);
        int sizeOfDivision=valuesAverages.size();
        double sum=0;
        for (int i = 0; i <(Math.min(sizeOfDivision, size)) ; i++) {
            Integer value=valuesAverages.get(sizeOfDivision-1-i);
            if (value!=null){
                sum+=value;
            }
        }
        return sum/(Math.min(sizeOfDivision, size));
    }
}
