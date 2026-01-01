package org.example.Sorting;

import java.util.Arrays;

/*
* Insertion Sort
*
* Array is partitioned as two half - left & right
* left - sorted array
* right - unsorted array
*
*  For each pass(i index) the swapper loop(j indexed) continues until all the right partition values are moved into left partition in appropriate position
*     For 1st pass
*     comparing first element in right array (2nd index) and last element in left array(1nd index)
*           if first element in right array is smaller than the last element in left array
*               then the right array element is transferred to end of left array
*                  then within swapping loop(j) is continued until the complete left array is sorted and in right order
*                       on last inserted element is compared to the previous element of last array in left partition
*                           swap needed - > value is swapped and pointer is moved to previous elements and swapping is made until no swapping is required i.e all left elements
*           if first element in right array is larger than the last element in left array
*               then the right array first element is appended to the end of left array and swapping loop is breaked for that pass
*                [Note : why no comparison is required : because all the left aligned elements of left array are sorted already , so comparing it with last item of left array if we can conclude the new element is greater then remaining left aligned elements will also pass the criteria , So compariosn required)
* */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,1,6,3,4};

        for (int i=0;i<arr.length - 1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j-1] > arr [j]){
                    int swap = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = swap;
                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
