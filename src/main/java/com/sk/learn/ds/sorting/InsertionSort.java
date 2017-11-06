package com.sk.learn.ds.sorting;

import java.util.Arrays;

/**
 * @author shankarmodi
 * 06/11/17
 */
public class InsertionSort {

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

        int key,j;

        for (int i=1; i <arr.length; i++){
            key = arr[i];
            j = i;

            while (j>=1 && arr[j-1] > key){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j] = key;

        }

        return  arr;
    }
}
