package com.example.array.search.revised;

import java.util.Arrays;

/*
    Search in Rotated Sorted Array

    You are given an integer array nums sorted in ascending order (with distinct values), and an integer target.
    Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

    If target is found in the array return its index, otherwise, return -1.

    Solution:
    - Use a modified binary search to do the search for the index of a given targeted key
    - Use recursive method which specify the lower bound (left / l) and upper bound (right / r)
        along with int array and key as input parameter
 */

public class Solution {

    public static int search(int[] arr, int key) {

        return search(arr, 0, (arr.length - 1), key);

    }

    private static int search(int[] arr, int l, int r, int key) {

        if (l > r) return -1;

        //int mid =  (r + l) /2 ; // normal way to find middle point (mid)
        int mid =  l + (r-l)/2;   // which can avoid the overflow

        // return mid index if key is same as middle point
        if (arr[mid] == key) return mid;

        // sub-array (l .. mid) is sorted
        if (arr[l] <= arr[mid]) {
            // check which portion of sub-array the key is located in
            // search the first half
            if((arr[l] <= key) && (key <= arr[mid])){
                // l .. key .. mid - 1
                return search(arr, l, mid - 1, key);
            }

            // otherwise, search other half
            //  mid + 1 ... key ... r
            return search(arr, mid + 1, r, key);
        }

        // otherwise, another sub-array (mid+1 .. r) should be sorted
        // then check which portion of sub-array the key is located in
        // search the first half of another sub-array
        if ((arr[mid] <= key ) && (key <= arr[r])) {
            // (mid + 1) ..key ..  r
            return search(arr, mid + 1, r, key);
        }
        // final case
        // search other half of another sub-array
        return search(arr, l, mid - 1, key);
    }

    public static void main(String[] args) {

        System.out.println("Given a test Case: \n");
        int[] numbers = new int[]{8, 9, 10,1, 2, 3, 4, 5, 6, 7};

        int key = 1;

        System.out.println("  Input: numbers = " + Arrays.toString(numbers) + ", target = " + key );

        int i = search(numbers, key);

        System.out.println("  Output: ");
        if (i != -1){
            System.out.println("    index is: " + i);
        } else {
            System.out.println("    Key (" + key + ") is  not found in a given array: " );
        }
        System.out.println();

        System.out.println("More test Cases: \n");
        System.out.println("Test Case 1: \n");
        int[] arr = new int[]{4,5,6,7,0,1,2};
        key = 0;
        System.out.println("  Input: numbers = " + Arrays.toString(arr) + ", target = " + key );
        System.out.println("  Output: " + search(arr,  key));
        System.out.println();

        System.out.println("Test Case 2: \n");
        arr = new int[]{4,5,6,7,0,1,2};
        key = 2;
        System.out.println("  Input: numbers = " + Arrays.toString(arr) + ", target = " + key );
        System.out.println("  Output: " + search(arr,  key));
        System.out.println();

        System.out.println("Test Case 3: \n");
        arr = new int[]{1};
        key = 0;
        System.out.println("  Input: numbers = " + Arrays.toString(arr) + ", target = " + key );
        System.out.println("  Output: " + search(arr,  key));
        System.out.println();

        System.out.println("Test Case 4: \n");
        arr = new int[]{};
        key = 0;
        System.out.println("  Input: numbers = " + Arrays.toString(arr) + ", target = " + key );
        System.out.println("  Output: " + search(arr,  key));
        System.out.println();
    }
}
