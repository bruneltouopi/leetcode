package org.leetcode.interviews.ms.array_string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bruno-fabrice touopi
 */
public class MatrixZeros {

    public void setZeroes(int[][] matrix) {
        Map<String, Integer> marker = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //let check if indice is a marker
                if (matrix[i][j] == 0 && !marker.containsKey(i+"#"+j)){
                    j=0;
                    marker.put()
                    matrix[i][j]=0;
                }
            }
        }
    }
}
