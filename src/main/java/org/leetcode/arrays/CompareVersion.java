package org.leetcode.arrays;

public class CompareVersion {

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0","1.0.0"));
    }
    public static int compareVersion(String version1,String version2){
        String[] v1= version1.split("\\.");
        String[] v2= version2.split("\\.");
        int length= Math.max(v1.length,v2.length);
        int value1=0;
        int value2=0;
        for (int i=0;i<length;i++){
            value1=i>v1.length-1?0: Integer.parseInt(v1[i]);
            value2=i>v2.length-1?0: Integer.parseInt(v2[i]);

            if( value1 > value2){
                return 1;
            }else if(value1 < value2){
                return -1;
            }
        }
        return 0;

    }
}
