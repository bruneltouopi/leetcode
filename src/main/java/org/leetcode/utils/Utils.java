package org.leetcode.utils;

import jdk.jshell.execution.Util;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

/**
 * @author bruno-fabrice touopi
 */
public class Utils{
    public static  void printArrayInt(int[] array){
        StringBuilder arraytoPrint=new StringBuilder("[");
        for (int i = 0; i <array.length ; i++) {
            arraytoPrint.append(array[i]);
            if (i<array.length-1) {
                arraytoPrint.append(",");
            }
        }
        System.out.println(arraytoPrint.append("]").toString());
    }
    public static  <T extends Number>void printListNumber(List<T> list){
        StringBuilder listPrint=new StringBuilder("");
        list.forEach(e->listPrint.append(e).append(","));
        System.out.println(listPrint);
    }

}
