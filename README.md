# Task

    Search in Rotated Sorted Array
    
# Requirement

    You are given an integer array nums sorted in ascending order (with distinct values), 
        and an integer target.
    Suppose that nums is rotated at some pivot unknown to you beforehand 
        (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

    If target is found in the array return its index, otherwise, return -1.

# Solution

    - Use a modified binary search to do the search for the index of a given targeted key
    - Use recursive method which specify the lower bound (left / l) and upper bound (right / r)
        along with int array and key as input parameter
    - Time Complexity: O(log n)
        To find the given targetd key using Binary Search, log n comparison is needed. 
    - Space Complexity: O(1) 
        No extra space is needed
         
# Test cases

    Given a test Case: 
    
      Input: numbers = [8, 9, 10, 1, 2, 3, 4, 5, 6, 7], target = 1
      Output: 
        index is: 3
    
    More test Cases: 
    
    Test Case 1: 
    
      Input: numbers = [4, 5, 6, 7, 0, 1, 2], target = 0
      Output: 4
    
    Test Case 2: 
    
      Input: numbers = [4, 5, 6, 7, 0, 1, 2], target = 2
      Output: 6
    
    Test Case 3: 
    
      Input: numbers = [1], target = 0
      Output: -1
    
    Test Case 4: 
    
      Input: numbers = [], target = 0
      Output: -1