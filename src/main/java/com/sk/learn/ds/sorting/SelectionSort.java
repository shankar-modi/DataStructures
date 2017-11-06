package com.sk.learn.ds.sorting;

import java.util.Arrays;

/**
 * @author shankarmodi
 * 06/11/17
 */
public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = new int [] {64,52, 25, 12, 22, 11};

        System.out.println("Unsorted array");
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------");

        int[] sortedArr = sort(arr);

        System.out.println("Sorted array");
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(sortedArr));
        System.out.println("-----------------------");
    }

    private static int[] sort(int[] arr) {

        int min;

        for (int i=0; i < arr.length-1;i++){
            min = i;

            for (int j=i+1; j<arr.length; j++){
                if(arr[min] > arr[j]) min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

//            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}
