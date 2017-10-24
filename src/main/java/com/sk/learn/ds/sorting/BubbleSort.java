package com.sk.learn.ds.sorting;

import java.util.Arrays;

/**
 * @author shankarmodi
 * 24/10/17
 */
public class BubbleSort {


    public static void main(String[] args) {
        int [] arr = new int[]{60,50,40,30,20,10};
//        int [] arr = new int[]{10,20,30,40,50,60};

        arr = bubbleSort(arr);

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }

    private static int[] bubbleSort(int[] arr) {
        int comparision = 0;
        int outer = 0;
        for (int i=0; i<arr.length; i++){
            outer++;
            for(int j=0; j<arr.length-1-i;j++){
                comparision++;
                if(arr[j] > arr[j+1] ){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println("Number of comparision : "+ comparision + "  Outer : " + outer);
        return arr;
    }


}
