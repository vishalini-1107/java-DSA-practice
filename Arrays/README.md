### Problems

# Problem 1 - Two Sum 

# Problem Statement
  find the index of two element whose sum is equal to the target
**Approach: ** HashMap
**Time Complexity:** O(n)
**Space Complexity:** O(n)

# Logic
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
# Problem 2 - Maximum Subarray Sum
# Problem Statement
Find the maximum sum of a contiguous subarray in a given integer array


