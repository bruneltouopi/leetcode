package datastructures;

import java.util.Arrays;

public class BinarySearch {


    public static void main(String[] args) {
        int[] tab= new int[]{1,2,3,4,6,8,9,11,12,15};
        Arrays.sort(tab);
         int r = searchIndex(tab,12);
        int r2 = binarySearchRecursion(tab,12,0,tab.length-1);
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r == r2);
    }

    public static int searchIndex(int[] arr, int a){
        int left = 0;
        int right = arr.length -1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (arr[mid]==a){
                return mid;
            }
            if(a > arr[mid]){ //right side
                left = mid+1;
            }else{ // left side
                right = mid;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] arr,int a,int left,int right){


        if(left > right){
            throw new IllegalArgumentException();
        }
        int mid = left + (right - left)/2;
        if (arr[mid] == a){
            return mid;
        }
        if (a < arr[mid]){
           return binarySearchRecursion(arr,a,left,mid-1);
        }
        return binarySearchRecursion(arr,a,mid +1,right);

    }
}
