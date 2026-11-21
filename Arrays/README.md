# Problems

## Problem 1 - Two Sum 

### Problem Statement
  find the index of two element whose sum is equal to the target
* Approach:  HashMap
* Time Complexity: O(n)
* Space Complexity: O(n)

### Logic
* Traversal the  array
* calculate the complete by "target -array[i]"
* check whether the complete exist in the Hashmap
* if yes, return the indices of the two elements
* else , store the current element as Key and index as Value

### Example-1

Input:
```
Array = [1, 3, 5, 7, 9, 13, 15]
Target = 22
```
Output
```
3 6
```
arr[3] + arr[6] = 7 + 15 = 22

### Example-2

Input:
```
Array = [1, 3, 5, 7, 9, 13, 15]
Target = 21
```
Output
```
-1 -1
```
## Problem 2 - Maximum Subarray Sum
### Problem Statement
Find the maximum sum of a contiguous subarray in a given integer array

* Approach: Kadane's Algorithm
* Time Complexity: O(n)
* Space Complexity: O(1)

### Logic
* Initialize 'Current sum' and 'Maximum sum' with array first element
* Traverse the array
* Decide whether the current element is extent of existing element or start a new array from current element 
* Update 'Current sum' with maximum value
* Update 'Maximum sum' by comparing it with 'Current sum'
* Return Maximum sum as final answer

### Example

Input:
```
Array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```
Output:
```
6
```

## Problem -3
### Problem Statement
Find two lines that together with the x-axis form a container that holds the maximum amount of water.
* Approach: Two Pointer Technique
* Time Complexity :O(n)
* Space Complexity: O(1)
### Logic 
* Initialize Two pointer: Left at beginning index and right end index of the given array
* Calculate the width by subtracting left index from right index
* find minimum height between the two pointers
* Calculate current container by multiple of width and minimum height
* Update maximum area by comparing current area and Previously stored maximum area
* Move the small height index towards other pointer
* Repeat until both pointer meet
* return the maximum area
### Example
Input:
```
Array=[1, 8, 6, 2, 5, 4, 8, 3, 7]
```
Output:
```
49
```
