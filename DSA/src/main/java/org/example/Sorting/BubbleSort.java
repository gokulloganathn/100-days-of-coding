package org.example.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,2,4};
        boolean nothingSwapped=true;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("loop : "+i);
            System.out.println("Before : "+Arrays.toString(arr));
            for (int j = 1; j < arr.length - i; j++) {
                System.out.print("comparing index ");
                System.out.print((j-1)+" & "+(j)+" -> ");
                System.out.println("swap is"+(arr[j] < arr[j-1] ? " not ":" ")+"possible");
                if (arr[j] < arr[j-1]){
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                    nothingSwapped = false;
                }
            }

            if(nothingSwapped){ // if any of the comparison carried to swapping of elements then it will be false
                break;
            }

            nothingSwapped = true; // reset the status to false before make next looping process
            System.out.println();
            System.out.println("After : "+Arrays.toString(arr));
            System.out.println();
        }

    }
}
